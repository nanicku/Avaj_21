JAVAC = javac
FILE = .scenario.txt

all :
	@$(MAKE) compile
	@$(MAKE) run

compile :
	find * -name "*.java" > sources.txt
	javac @sources.txt

clean :
	find * -name "*.class" -delete

run :
	java simulation/Simulation $(FILE)

re :
	@$(MAKE) clean
	@$(MAKE) all