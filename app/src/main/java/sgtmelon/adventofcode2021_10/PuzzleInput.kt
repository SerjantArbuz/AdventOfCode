package sgtmelon.adventofcode2021_10

object PuzzleInput {

    const val input =
        "<[{([[<{{(<{[({}<>){{}{}}][<<>{}>[<>{}]]}(<<<>()}{[]()}>([{}()][()()]))>[({({}[])(<>())}){[({}()){[][]}]{[\n" +
                "{{{{(([((<[{<<(){}>{<>}>{<(){}>{()[]}}}([{()]<{}{}>])]{<{{()[]}{[]{}}}(<[]<>>{()[]})>}>[[<{([]{}){\n" +
                "[([(({<{<<<[((<><>){<>[]})]<[<[]()>[[][]]]({<>[]}<()<>>)>><<({<><>}[()[]])[[<>{}]<[][]>]>>\n" +
                "<<<[{({[{([{{{()()}<<><>>}[{[]()}]}[({()<>}{()[]}){<{}<>>({}[])}]]({{{[]<>}<<>{}]}}<<([]{}){()[]}><({}\n" +
                "{<({{([<<{<[[(<>{})[{}[]]]]>}<{<<{()<>}><[()()]{<>[]}>>[({[]{}}[{}{}])({()[]]{[][]})]}[{<[()()]>}{({\n" +
                "[[<[[{[<[{[[<<{}<>>(()())>{{[][]}[[][]]}]][{{<<><>>[<>]}((()){[]<>})}([(<>{})<[]<>>][{[]<>}])]}{[[<{\n" +
                "({{(<(([{<{<(({}[])(()[]))<{[]{}}{<>{}}>>}[<(<{}()><()<>>)[[[]()]{{}[]}]>]>{([(([][])){(<><>)[\n" +
                "([{[([{[[{([(<{}<>>{()<>}){<<>><{}()>}])}({([{(){}}[[]{}]]){{{<><>}}((()<>))}}({{<<><>><(){}>}<{()()\n" +
                "({([[{[{{<[[{(()()){()<>}}[[<>[]]]]<[[[]{}]]{({}[])[[]()]}>]({<{<>{}}<<>[]>><[{}{}](<><>)>}[(<{}[]><[]<>>){[\n" +
                "<[([[[((({{{((()()){[]}){{<>()}[()[]]}}[<{()<>}[[]()]>]}[<{{<><>}<<><>]}{(<>())[{}[]]}>]})))](([(\n" +
                "[<({<<<{[[[[([{}{}]<<>()>){<<>{}><<>[]>}][{({}[])(()())}(<<>{}>{<><>})]]{[[([]()){()<>}]{(<><>)<{}<>>}]{[{()\n" +
                "{{{([{({(<[[(<()<>>)<(<>{})[<>]>]]{<{{<>{}}(<>())}<[()<>]{[][]}>><{(())[[]()]}[[[][]]([]())]>}>><([(<[()<\n" +
                "[<((<<({[((<[<[][]><(){}>](({}<>)[[]{}])>([[<>[]]]{({}<>)[<>{}]}))[{{<()<>><()<>>}{(()[])({}<>)}}({{[](\n" +
                "{{(<({[({({<{({}<>)([][])}>[({[]{}}{[]{}})<(<>())({}{})>]}<[[<()<>>([]{})][[[]<>](()[]}]]>)}<([{(<{}<>>)}\n" +
                "{{((<{(({((({<<>[]>[<>[]]}[<[]>({}<>)])[{[<>()]([]{})}({()<>}({}[]))]){{(<()<>>([]<>))[<{}{}\n" +
                "{[(<[[{<{(<{<<[]<>>(<>[])>([[]{}]{[]()})}<[[<>{}]{[][]}][(<>)[{}{}]]>>(((<()[]><()<>>)[{()<>}[()()]}){[\n" +
                "((({([<{<[{[([()<>][{}<>])]}<{(<<>>([]{}))<{[]()}(<>[])>}>]{{{{{[][]}<{}{}>}({{}()}<{}{}>)}<{<<>()>([]{})\n" +
                "{(<[[[[({[[<{[(){}][{}]}<<<>()>((){})>>{(<<><>>[[]{}])[<[]()><{}()>]}]{{<({})(<>{})>([{}<>](<>()\n" +
                "(<({{<({<[{[((<>())<{}()>)[{[][]}[[]{}]]]}<([{{}()}[{}[]]]([<><>][{}()]))>]{<{{[<><>]}<<(){}>({}{}\n" +
                "[<[[{{([{[<{[{<><>}[()[]]]}[(<<><>>)[<<>[]>{[][]}]]>((<([]{})<[]()>><(()())[<>[]]>))]}[<{{{[<>{}]}([{}[]]<\n" +
                "{[(<<{<{<(<<[<<>><{}{}>][{[]}{(){}}]>>(([({}<>)<{}<>>][({}())])[[{<><>}[<>()]]<(()[])(<>{})>]\n" +
                "<({[{<{{{((<{<{}<>>(()())}<[(){}>>>{<(<><>)[<><>]>([()[]](<><>))}))}}}([{{{<[{<>()}(()<>)][{<>[]}{(){}}]>[[<\n" +
                "[({[<{{<<<{(<<{}<>>[<>[]]>{{<>}{()<>}}){<[<><>]><{()[]}(()[])>}}>([({{<>[]}{(){}}}[(<>[])[[][]]]){\n" +
                "({(<{{{[[({{{(<>{})[[]<>]}[<[]<>>[<>{}]]}[{[<>{}]}([<>][<>[]])]}((<[[]()]<{}{}>><[{}<>]<(){}>>)({<[]{}>[{}\n" +
                "<<[[<{{{[{[[<[()[]]{(){}}><{{}<>}>]<[{[]()}{{}[]}]{[<>{}]<()>}>]}[<{((<>{})){{(){}}}}(<{<>[]}{{}[]}>[{{\n" +
                "[<{[[<<<<{<[[{()})<(()[])([]())>][{{{}<>}(<>{})}<<{}>(<>[])>]>}>>{{<[{{[<><>]{{}()}}}](<<(<>)({}{})><[<>()]\n" +
                "(([[<[(<[[(([{{}}<[]{}>]){<((){})({}<>)>{([]())}})[<[{(){}}{[][]}]<[{}<>][(){}]>>{{{{}{}}{<><>}}}]]]([<<({(\n" +
                "<<{({{<{{<[(([[]])[({}())[[]()]]){{<[]<>>[(){}]}<<<><>>({}[])>}]{{{<()<>>[[]<>]}<[()()][<>]>>[{<[]{}>[<><>\n" +
                "[(<<([<{[<<{<{{}{}}({}[])><[<><>]{()[]}>><{{<>{}}([]{})}{[(){}]{<>()}}>>([(<[][]><{}>)<<()[]\n" +
                "<((<<{([([<<[{()[]}{()<>}]>[[([]{})(()<>]][<()<>><[][]>]]>]{[(<(<>{})<[]()>>)[{{()}}<(<><>)(<>[])>]\n" +
                "{<<[{<<[{[{{(({}{})<()<>>)}}]}<(<([{<><>}(<>())]{({}<>)})[<{[][]}[(){}]>]><<<({}()){{}()}>[[<>[]]<{}{\n" +
                "{<{<({<<{{[<[[(){}]]><[([])[<>()]](<<><>><[]()>)>]<(([{}()]([]<>))<{<>{}}<[][]>>)<(<()>)>>}[[{{<()<>><{\n" +
                "({[<[{[<((<{<<{}()>><{()()}{[]()}>}<[{()[]}{{}()}][((){})<<>()>]>>)({[(({}[])[()]){[[]{}]<{}()>}][{<()[]>{()\n" +
                "[(<(<{[(<<<([<{}{}){<>()}]){<[<><>]({}[])>((()())[{}{}])}>[{<{[][]}{{}<>}><{()<>}[[]()]>}{{{[]\n" +
                "{{{<<[{[{<(<([()[]](()[]))([[]<>]([]()))><[[[][]]{<>()}]{{<>[]}<{}()>}>)>{{{[[(){}]<{}[]>][(\n" +
                "{[[[{[[<{<{{{<{}<>>[<>]}<[[]{}]{<>()}>}<{<(){}>{<>{}}}((<>[])[{}{}])>}{<<<[]()>[[]()]>{{()[]}\n" +
                "([(<([<{<{(<[<()[]>[<>()}]({<>{}}<<>[]>)>([({}())[[]<>]]))[<<{<>()}>(<(){}>({}<>))>]}>}{({[[<[()\n" +
                "(({(({(<<<<[[([][])(<>)][({}{})[(){}]]]>(<<<{}[]>(<>[])><(<>[])({}())>>)>[{{[{[]{}}<()<>>]{([]()){()<>}}}<[\n" +
                "({<{[{[[[({[[({}[])]<([]())>][((<><>){()[]})({()[]})]}){({<[<>[]]{[]()}>((<>{})((){}))}<<<<>[]>>{{[][]}[{}\n" +
                "({{{{<<{{({(<(<>{}){<>[]}>)<[[[][]]({}<>)][{[]<>}]>}(([{<>()}[<><>]](((){})[()[]]))))[<{<[[]{}]<{}<>>>(<{\n" +
                "([{[(<<[{{[[{<()<>><()<>>}[<[]<>>({}())]]([(<>()){<><>}]([{}()]{<><>}})]}({<{((){}){{}[]}}>})}<[{(<[{}()]\n" +
                "({(<{{[{[(<([<{}[]><{}{}>]<[{}()]{[]<>}>)<((<>())<{}<>>)<{(){}}{{}<>}>>><[[[{}<>](()<>)]<<<>{}\n" +
                "{[{{((<{[(([[{()<>}[{}<>]]]{<{[]()}><<{}[]>{{}<>}>}){<{<()<>>[(){}]}[[()[]]{<>[]}]><[<<>[]]{<>}]{{\n" +
                "<[({{{<{({<<<([]())[[][]]><[<>{}]<[]<>>>>{[[{}()]<{}{}>]}>})}([{(({(()())(()<>)}[[[]][{}()]])[({()<>})])}\n" +
                "{{{[([<<[{{[{{[]{}}<()<>>}<({}{})<()<>>>]<({<><>}{()})(<()>({}[]))>}(<((()<>)(<>{}>)<[<><>]<<>()>>>({[{\n" +
                "(<({[(<({<<[{([]{}){<>()}}{<()<>>[<>[]]}]<{[{}<>]{()[]}><{[]{}}{()()}>>>><{[[[()()][[]<>]]<[()<>][\n" +
                "<<([{{{<[<{<<[()()][()]>{<{}>}><([{}{}]{{}()})>}>([(((<>()){{}{}})[([]{})<{}<>>]){((<>())<{}[]>)(<()<>\n" +
                "(([[({{{({(<(<[][]>{[]{}})>)}<<{<([]{})[{}{}]>{<{}<>>}}>[<{({}[])({}())}<<()[]>>>]>)<<[<<(\n" +
                "<<[[({<{[([<{<{}>{[]{}}}{<<>{}><<>[]>}><{[[]{}]<()[]>}{[<>{}]}>]<(<[(){}>[()<>]>{{()[]}<<>{}>})<<[[]<>](()())\n" +
                "{([({({([[{({{(){}}([]())}<{{}{}}[{}[]]>)}[({[<>{}]<{}<>>}{{{}[]}([]{})})[<<()[]>(<><>)>{(<>()){{}{}}\n" +
                "{[[{[{{<[(<([{[]{}}{[]()}]([()[]]))<{([]{})([]())}{[[]<>][{}{}]}>><[[<[]<>>[[]<>]]([{}()]([]))>[(({}{})[[][]\n" +
                "[[{[<{<[{<<(([{}()](()()))([{}()]([]{})])({(<><>)}[{[]<>}([]{})])>({{<{}[]>[(){}]}<[()<>][{\n" +
                "[{{<{[(<<{[(<{{}{}}[[]{}]><[[]()]>)(<<()[]>(())>)]}({(<<{}<>><[]{}>>{<()()>{[]<>}})})>((<<({{}<>}[<>{}\n" +
                "{<(<{(<{{<{({<{}()>{<><>}}{(<><>)<<>[]>})<<(<>())([][])>[<{}{}>{()}]>}>[(<[<<>()><{}>][[(){}](\n" +
                "({{{[((<{([{{(<>{})}[{()}[[]{}]]}<{{{}{}}{[]()}}{{(){}}}>]([(([][])(()()))]{[<[]{}>]})}}>)){(\n" +
                "<([[{<{<[{({((()[])((){})){{<>{}}([]{})}})}([<([<>{}]([]))({(){}}([]<>))><[([]())(<>())}[{<>[\n" +
                "[[<<{([{[[{[([[]<>]{{}()})<({}<>)[[]{}]>]{{{{}<>}{[]()}}[<[][]>{<>[]}]}}{[([<>{}][(){}])]<<[<>[]][<><>\n" +
                "{({[<{<{<[{[{{{}<>}[[]()]}]{{[{}{}]([]<>)}}}](([[[()()]{()<>}]((<>[]){{}()})](((<>{})[{}[]]){{{}<\n" +
                "{<<[({{[{{{{<([]{})[<>[]]><{()()}{()<>}>][<<()[]>[[]()]>[[()()][{}[]]]]}[<(<()[]><{}<>>)(({}[]\n" +
                "{({((<<[{[[{{<{}[]>([])}<[[][]]>}({{[]()}{()()}}{<{}[]>[[]<>]})]{<[{[]}[()[]]]<<()()>{[][]\n" +
                "<<(<((({<{{[([<><>])[[[]<>]{[]}]]}}>[{[{({{}()}{<>()})[<[]<>>[[]{}]]}<((<>()){(){}])(<<>{}>(<><>))>]}([[\n" +
                "{[<<<([([[({<[[][]]>{<[]()>[[]()]}}({<[]{}>})){[<<<>()>[{}{}]><[[]<>]<()<>>>](<[{}<>]{[]<>}>[{()[]}[()()]])}\n" +
                "<<[{[[<{{{[({[<><>]{{}{}}}<[()()]((){})>){<(<>{})<()<>>>[<[]{}>{()()}]})<((<<><>>){[(){}]})<{{<>[]}<[][]>\n" +
                "[{({[((<(({[[[{}<>]<[]<>>][{[][]}[()[]]]][[{{}}[[]()]]<[{}<>]<{}{}>>]}{[[[<><>]<<><>>]{{[]{}}({}{})\n" +
                "[<{[(<[[({<({[()[]]<()()>}<(()<>)>)>({(<[][]>[<>[]])})}<{({{()[]}<<>>}((<>[]){[]{}}))[(([]())\n" +
                "(<({[{{(<{<<{{[]{}}<()<>>}<<(){}>[[]<>]>>{<(<>())<()()>>}>(<((()<>)<{}{}>)([[]<>](<>{}))><[<{}()><[]<>>]>)}\n" +
                "[([[[([(<(<[<<[][]>[[]()]>[{{}{}}([]{})]]>{{[([]{})([]{})]}[[(<>)(<>{})]]}){([([()]<{}{}>)(({})(()[]))]{[{[\n" +
                "({<<<<[(([{<{{<>}<{}{}>}>{{[()()}({}{})}<([]{})({}[])>}}])){({{(({()<>})[(<><>)<{}{}>])<({()<>}[()()])[{()\n" +
                "([[({{{(<([<<{[][]}{{}[]}>[{{}<>}([]<>)]>[(<[]>[()()])}])(<(([{}][<><>])<{[]{}}{{}()}>)<[<{}{}>[()()]]\n" +
                "<{<{((({<<<{[({}())<{}{}>]<{[]()}{[]<>}>}<<<{}()>[()<>]>{{[]<>}{[]<>}}>>>><{[[({(){}}([][]))((\n" +
                "[(<<<<[({({({[()<>]<()>}([(){}]<[]{}>)}{{<<>()><()[]>}[[{}()]{{}[]}]}}{(((()))[[()[]]{[][]}])((<<><\n" +
                "<<([[[{[([((([<>()][[]{}]))[({[][]})<{{}()}<()())>])])<{((<((){})>((<>())({}{})))<(([]())<{}()>){(()\n" +
                "<[{{<[[{[{[<<{<>()}<<>()>>{[<>{}]{()<>}}>(<<{}{}>>{<[][]>[<><>]})]([<<<>()]<{}[]>>{<<>()>{<>{}}}]<{[<>{}](\n" +
                "[<[[{({([<<(<{(){}}<()[]>}(<<>{}><<>()>))>[<{<()<>>}{({}<>)}>]><<<[{[]()}<{}{}>]{<()>}>>>])})}]<\n" +
                "({<[((<([[{[{<()>([]{})}{{{}<>}[[]()]}]}{((<{}()>[<>{}])<{{}[]}>}{<{{}{}}>}}]([[{<()<>>{<><>}}<{()()}([]\n" +
                "([{<<[{{(([<<{<>()}{()<>}>{[[]{}]{{}{}}}>[<[[]{}][{}[]]>[({}())<()<>>]]][{{(<><>)<{}[]>]<<{}<>>[<>\n" +
                "[{[{<[<(<[({[[()[]]<[]{}>]({[]<>}(<><>))}({[[]<>>(()[])}(<<>[]>)))]>{{[{{[(){}]([]<>)}}({[()\n" +
                "{{<({<<((<<[[({}[])]({()<>})][{(()<>)}{[()<>]{{}}}]>>([{{<()[]>{[]()}}[([]{})<<>()>]}[{{<>()}[{}[]]}[({}{})\n" +
                "([[({<[<{<<{{<<>()><<>[]>}}>[{<({}()){{}()}>[[()[]]{()()}]}[{(<>{}}({}())}<{[]<>}<[]()>>]]>}([{{(<{}<>>\n" +
                "(({{[([([<<[((()<>){{}()})<[(){}]{(){}}>]({({}())<{}()>}(<{}<>>[()[]]))>>]{[((([()()](<>)))<([<>\n" +
                "{{[<<<{[{{[{[<<><>>]}[<[()[]]{{}{}}><(<>[])((){})>]][({(()[])<[]<>>}<[<><>](<>())>)])(<{{{[]<>}(()\n" +
                "{([{<{(<({(({([]<>)(<><>)}{{()<>}({}[])}){[{()<>}[{}()]]<<<>{}>[<>]>})}<({{{{}{}}[()()]}(<\n" +
                "(<<[{[{{[{<[[[()[]]({}<>)]<[[]()]<[]()>>]<{{<>{}}(()<>)}[([]())[[]()]]>>{<[{<><>}{<>{}}]<<[]()>(<>[])>>}}{{[\n" +
                "{<{((<(((<{[[<<>()>[[]()]]{([][])[()<>]}]{({{}<>}({}{}))<{<>{}}[<>])}}>{<{{{<>{}}(<><>)}<<(){}><[]()>>}{<[\n" +
                "{{{[((([([(<([()<>]{()<>})>){{{{<><>}{[]{}}}}[{({}{})(()<>)}[{{}}([]{})]]}][<({<{}{}><<>()>}[[<>()]])>([[[\n" +
                "{[<<[<<{<{{[({{}{}}{[]()})<(<>())[{}()]>]<<[{}[]](()<>)>[[<>{}][{}<>]]>}(<([<><>]>(<[]>{{}[\n" +
                "<<{[{<([{{<[{<[]()><[]{}>}[<<>{}>{{}{}}]]>{{<({}){[]{}}><<[]()>([]())>}{{(()<>)><[<><>][[]]>}}}}(<{((\n" +
                "{(<([{{<[<{({[<>()]}[<<>[]>[[][]]])({([]<>){{}{}}}[[<><>][{}()]])}>(<[[<<>()>{{}()}>{<<>()>{[][]}}]<\n" +
                "[(<{([[[{<({<{()[]}[[][]]><[{}[]]{()()}>}<[{{}[]}{()}]>)><(<<{<><>}({}())>><<({}{}>[[]()]>>)(<[{()[]}<<>()>]\n" +
                "(<<{([((<[({({{}[]})<<()()><<><>>>})<{[[(){}][{}[]]][([]{})<()<>>]}([(()<>)]<{{}{}}>)>}>))<{<[(((([]())[{}[]]\n" +
                "([{{<{[([[(((<[][]>){{{}[]}{()<>}})){[<[<>{}]<<><>>>]}]<({{(<>{}){<>[]]}<<<>[]>[<>[]]>}(<<{}[]>\n" +
                "[{{<({<{{<({{[()]<<>[]>}[{{}{})<[]<>>]}{[[()()][{}[]]][<[][]>{<>[]}]})<{{[()[]]<()[]>}<[[][]]\n" +
                "((([[((<((((<<(){}>[<>[]]>[({}[])(<>())]))[<<[{}[]]>((<>[]}{[]()})><[[{}()]<[]()>]>])([([({}<>)]<(\n" +
                "[[([{[<<({[<{((){})<<>()>}{{<>[]}<{}[]>}>(((()[])[[]])<(())>)]((<<{}()>[[]()]>){<<<><>>{{}<>}>})}<<[{["

}