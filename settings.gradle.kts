rootProject.name = "backend"
includeBuild("build-plugins")

includePath(":gateway-application", "apps/gateway/application")

includePath(":users-application", "apps/users/application")
includePath(":users-domain", "apps/users/domain")
includePath(":users-adapters", "apps/users/adapters")

fun includePath(moduleName: String, path: String) {
    include(moduleName)
    project(moduleName).projectDir = file(path) // this line is required if your module name is different to folder structure
}
