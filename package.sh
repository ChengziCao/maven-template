mvn clean package -Dmaven.test.skip=true
mkdir release
cp target/Test-jar-with-dependencies.jar ./release/template.jar