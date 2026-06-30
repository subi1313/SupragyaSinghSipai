import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("default")

    productFlavors {
        create("dev") {
            dimension = "default"
            applicationId = "com.supragya.supragya_singh_sipai.dev"
            resValue(type = "string", name = "app_name", value = "MyApp-Dev")
        }
        create("staging") {
            dimension = "default"
            applicationId = "com.supragya.supragya_singh_sipai.staging"
            resValue(type = "string", name = "app_name", value = "MyApp-Staging")
        }
        create("prod") {
            dimension = "default"
            applicationId = "com.supragya.supragya_singh_sipai"
            resValue(type = "string", name = "app_name", value = "MyApp-Prod")
        }
    }

    buildFeatures.resValues = true
}