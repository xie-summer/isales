@echo -----------------------------------------------------------------------------
@echo TEST
@echo -----------------------------------------------------------------------------
mvn clean deploy -Dmaven.test.skip=true -Ptest
@pause