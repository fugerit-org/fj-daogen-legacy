# fj-daogen-legacy-v0-4-2-7

[Go to fj-daogen-legagy](../README.md)

This is a compatibility layer for [fj-daogen-maven-plugin](https://github.com/fugerit-org/fj-daogen/tree/main/fj-daogen-maven-plugin)

Just needed to add the legagy dependency : 

```
	<dependency>
		<groupId>org.fugerit.java.legacy</groupId>
		<artifactId>fj-daogen-legacy-v0-4-2-7</artifactId>
		<version>${fj-daogen-legagy-version}</version>
	</dependency>
```

To the plugin configuration only (not to the project) : 

```
			<plugin>
				<groupId>org.fugerit.java</groupId>
				<artifactId>fj-daogen-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>daogen</id>
						<phase>generate-sources</phase>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<daogenConfig>${project.basedir}/src/main/daogen/fugerit-sample-daogen-config.xml</daogenConfig>
					<genBaseDir>${gen.base.dir}</genBaseDir>
					<generatedSourceHelper>${generated.source.daogen}</generatedSourceHelper>
				</configuration>
				<dependencies>
					<dependency>
						<groupId>org.fugerit.java.legacy</groupId>
						<artifactId>fj-daogen-legacy-v0-4-2-7</artifactId>
						<version>${fj-daogen-legagy-version}</version>
					</dependency>
				</dependencies>
			</plugin>
```

NOTE: may be needed to adapt some configuration.