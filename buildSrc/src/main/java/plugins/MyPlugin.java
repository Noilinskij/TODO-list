package plugins;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.artifacts.VersionCatalog;
import org.gradle.api.artifacts.VersionCatalogsExtension;
import org.jetbrains.annotations.NotNull;

class MyPlugin implements Plugin<Project> {
    @Override
    public void apply(@NotNull Project project) {
        VersionCatalogsExtension catalogs = project.getExtensions().getByType(VersionCatalogsExtension.class);
        var libs = catalogs.named("libs");
        addPlugins(project, libs);
        addDependencies(project, libs);
    }

    private void addPlugins(Project project, VersionCatalog libs) {
        project.getPluginManager().apply(libs.findPlugin("java").get().get().getPluginId());
        project.getPluginManager().apply(libs.findPlugin("springframework-boot").get().get().getPluginId());
        project.getPluginManager().apply(libs.findPlugin("spring-dependency").get().get().getPluginId());
    }

    private void addDependencies(Project project, VersionCatalog libs) {
        project.getDependencies().add("implementation", libs.findBundle("spring.libraries").get());
    }


}