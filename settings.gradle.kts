rootProject.name = "backend"
includeBuild("build-plugins")

includePath(":gateway-application", "gateway/application")

includePath(":users-application", "users/application")
includePath(":users-domain", "users/domain")
includePath(":users-adapters", "users/adapters")

fun includePath(moduleName: String, path: String) {
    include(moduleName)
    project(moduleName).projectDir = file(path) // this line is required if your module name is different to folder structure
}
