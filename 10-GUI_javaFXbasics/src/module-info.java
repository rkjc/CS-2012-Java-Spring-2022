module guiJavaFXbasics {
	requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    
    exports examples;
    exports appBasicsFX; 
    exports appDemos; 
    exports layoutDemos;
}