import org.alexcawl.plugins.commonMainDependencies

plugins {
    id("convention.project.kmp.library")
}

android {
    namespace = "org.alexcawl.sculptor.common.engine"
}

commonMainDependencies {
    api(projects.common.sculptorCore)
    implementation(projects.common.sculptorContract)
    implementation(projects.common.sculptorLayout)
    implementation(projects.common.sculptorPresenter)
}
