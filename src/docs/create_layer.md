# Creating a compatibility layer for a specific fj-daogen version

## 1. Basic setup
Create a module named fj-daogen-legagy-vX-X-X with a pom.xml and add it to the parent pom.
[v1-0-1](../../fj-daogen-legacy-v1-0-1/pom.xml) may be used as an example.

## 2. Import the code
Checkout the specific tag version of project [fj-daogen](https://github.com/fugerit-org/fj-daogen) then : 
* Copy all the content of the src/main/java folder in the new module
* Copy all the content of the src/main/resources folder in the new module
* Change the fj-core or other relevant properties to match the fj-daogen version

## 3. Add the patches for fj-daogen-maven-plugin
Some classes should be mofified for the maven plugin to work.
You can use an example the [git patch file for v1-0-1](sample_patch_v1-0-1.txt).  
It is possible to just replace the relevant path and the property DAOGEN_LEGAGY_VERSION value.