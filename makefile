# makefile lab_4_console2

.SUFFIXES: .class .java

PACK=Lab_4_console2
TARG=Test
JC=javac -g
JM=java -ea -jar
JR=jar -cfe

OBJ=$(PACK)\Fraction.class \
    $(PACK)\Test.class

.java.class:
	$(JC) $<

run: build
	$(JM) $(TARG).jar

build: 	$(OBJ)
	$(JR) $(TARG).jar $(PACK).Test $(OBJ)

clean:
	for %%f in ($(OBJ)) do del %%f
	del $(TARG).jar

$(PACK)\Fraction.class: $(PACK)\Fraction.java makefile

$(PACK)\Test.class: $(PACK)\Test.java makefile

# eof makefile lab_4_console2
