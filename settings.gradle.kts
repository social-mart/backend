rootProject.name = "backend"

includePath(":gateway", "gateway")
includePath(":gateway-domain", "gateway/domain")
includePath(":gateway-adapters", "gateway/adapters")

includePath(":users", "users")
includePath(":users-domain", "users/domain")
includePath(":users-adapters", "users/adapters")

fun includePath(moduleName: String, path: String) {
    include(moduleName)
    project(moduleName).projectDir = file(path)
}
