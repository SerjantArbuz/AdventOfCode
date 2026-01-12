// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {

    }
}

plugins {
    alias(libs.plugins.android.app) apply false
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}
