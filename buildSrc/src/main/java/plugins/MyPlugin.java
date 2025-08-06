package plugins;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.jetbrains.annotations.NotNull;

class MyPlugin implements Plugin<Project> {
    @Override
    public void apply(@NotNull Project project) {
        addPlugins(project);
        addDependencies(project);
    }

    private void addPlugins(Project project) {
        project.getPlugins().apply("java");
        project.getPlugins().apply("springframework.boot");
        project.getPlugins().apply("spring.dependency");
    }

    private void addDependencies(Project project) {
        project.getDependencies().add("implementation","spring.libraries");
    }


}