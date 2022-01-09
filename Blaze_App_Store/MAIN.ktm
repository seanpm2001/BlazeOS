// Start of script
/*
Blaze App Store
Main script (core)
The Blaze App Store is an open source recreation of the Amazon App Store. It is written in Kotlin
License: GPL3
Language(s): English (US)
Authors: @seanpm2001
*/
// This script is far from complete
// Note: I am not very good at programming in the Kotlin programming language. For now, this is pseudocode
import(SYSmode); // The system mode variable
class bapp_store {
  // App pricing and display (its all free)
  fun pricing() {
   val appDefaultPrice = 0;
   val appMaxPrice = 0; // Proprietary paid software not allowed
   val appPrice_Determine = "FREE";
   break;
  }
  // App categories
  fun categories() {
    val categories = ["Gaming", "Productivity", "Programming", "Tools", "Other"];
    val gaming_subcategories = ["Strategy", "Adventure", "Single Player", "Multi-Player", "Puzzle", "Leisure", "Idle", "Other"];
    val productivity_subcategories = ["Calculation", "Programming", "Other"];
    val programming_subcategories = ["Markup", "IDE", "Interpreter", "LIBrary", "Linting", "Functional", "Block-based", "Duck typing", "Structured typing", "Object Oriented", "Web", "Desktop application", "Configuration", "Other"[;
    val tool_subcategories = ["Lighting", "Service", "Other"];
    return categories();
    return gaming_subcategories();
    return productivity_subcategories();
    return programming_subcategories();
    return tool_subcategories();
    break;
  }
  // Interface of the app store
  fun interface() {
    // Coming soon
    break;
  }
  // Install instructions
  fun installApp() {
    val installLocationIBOOK = "/BlazeOS/IgniteBook/User/Library/Software/$Variable.kot"; // Install instructions for IgniteBook
    var installLocationBLAOS = "/BlazeOS/User/Software/$Variable.kot"; // Install instructions for normal BlazeOS
    if (SYSmode == "IgniteBook") {
      return installLocationIBOOK();
      break;
    } else if (SYSmode == "BlazeOS") { // I could have simplified this line, but I wanted to make it more verbose
      return installLocationBLAOS();
      break;
    }
    break;
  }
  // Main method, handles and returns all other methods
  fun main() {
   return pricing();
   return categories();
   return interface();
   return installApp();
   break;
  }
  return main();
  break;
} 
/* File info
File type: Kotlin source file (*.ktm)
File version: 1 (2022, Sunday, January 9th at 3:34 pm)
Line count (including blank lines and compiler line): 70
*/
// End of script
