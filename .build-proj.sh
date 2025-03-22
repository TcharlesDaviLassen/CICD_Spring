clear

export JAVA_HOME=/usr/lib/jvm/java-17-oracle

echo Limpeza...

/home/tcharles/apache-maven-compiler-3.8.3/bin/mvn clean

read -n1 -r -p "Precione qualquer tecla para continuar..." key

clear

/home/tcharles/apache-maven-compiler-3.8.3/bin/mvn install -DskipTests