import java.nio.file.Path
import java.nio.file.Paths

// the path where the project got generated
Path projectPath = Paths.get(request.outputDirectory, request.artifactId)

// the properties available to the archetype
Properties properties = request.properties

// databaseName may be empty or "none"
String databaseName = properties.get("databaseName")

if (databaseName == "none" || databaseName == "") {
    // deletes db folder
    Files.deleteIfExists projectPath.resolve("src/main/resources/db")
}