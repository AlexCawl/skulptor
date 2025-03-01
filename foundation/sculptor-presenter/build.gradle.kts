import org.alexcawl.plugins.commonMainDependencies

plugins {
    id("convention.project.compose.library")
}

android {
    namespace = "org.alexcawl.sculptor.foundation.presenter"
}

commonMainDependencies {
    // Private dependencies
    implementation(projects.common.sculptorPresenter)

    // Public dependencies
    api(projects.foundation.sculptorContract)
    api(projects.foundation.sculptorLayout)
}
