package sgtmelon.adventofcode.year15.day7.useCase

import android.util.Log
import sgtmelon.adventofcode.year15.day7.model.Command

class CalculateWiresUseCase {

    operator fun invoke(commandList: List<Command>): Map<String, Int> {
        val leftCommands = commandList.toMutableList()
        val resultMap = mutableMapOf<String, Int>()

        var i = 0
        do {
            Log.i("HERE", "iteration: ${i++}")
            val removeList = mutableListOf<Command>()

            for (command in leftCommands) {
                val result: Int? = when (command) {
                    is Command.Bool -> getBoolResult(command, resultMap)
                    is Command.Shift -> getShiftResult(command, resultMap)
                    is Command.Not -> getNotResult(command, resultMap)
                    is Command.Set -> getSetResult(command, resultMap)
                }

                if (result != null) {
                    resultMap[command.to] = result
                    removeList.add(command)
                }
            }

            leftCommands.removeAll(removeList)
        } while (leftCommands.isNotEmpty())

        return resultMap
    }

    private fun getBoolResult(command: Command.Bool, resultMap: Map<String, Int>): Int? {
        val left = command.left.toIntOrNull() ?: resultMap[command.left] ?: return null
        val right = command.right.toIntOrNull() ?: resultMap[command.right] ?: return null

        return when (command) {
            is Command.Bool.And -> left and right
            is Command.Bool.Or -> left or right
        }
    }

    private fun getShiftResult(command: Command.Shift, resultMap: Map<String, Int>): Int? {
        val from = command.from.toIntOrNull() ?: resultMap[command.from] ?: return null

        return when (command) {
            is Command.Shift.Left -> from.shl(command.value)
            is Command.Shift.Right -> from.shr(command.value)
        }
    }

    private fun getNotResult(command: Command.Not, resultMap: Map<String, Int>): Int? {
        return (command.from.toIntOrNull() ?: resultMap[command.from])?.inv()
    }

    private fun getSetResult(command: Command.Set, resultMap: Map<String, Int>): Int? {
        return command.value.toIntOrNull() ?: resultMap[command.value]
    }
}