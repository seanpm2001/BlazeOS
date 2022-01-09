// Start of script
/* BlAPK
Blaze APK or BlAPK
The FLOSS APK interpreter for BlazeOS
*/
// I am not too experienced with Groovy, so this is not fully functional yet.
// This script is far from complete
class blapk {
  // Define the file format
  def fileType(string) {
    this.fileType = [".apk", ".xapk", ".apks", ".apkm", ".APK", ".XAPK", ".APKS", ".APKM"];
    break;
  }
  // Select the emulation version
  def selectVersion(string) {
    this.selectVersion = ["GA1.0", "GA2.3", "GA4.4", "GA5.0", "GA7.0", "GA8.0", "GA9.0", "GA10.0", "GA11.0"]; // GA stands for Google APK and the subsequent numbers are the Android version
    break;
  }
  // The desktop icon for the file type
  def icon(binary) {
    // Icon is coming soon
    icon28 = "/APK/BlAPK/MAIN.groovy"; // 28x28 icon
    icon32 = "/APK/BlAPK/MAIN.groovy"; // 32x32 icon
    icon48 = "/APK/BlAPK/MAIN.groovy"; // 48x48 icon
    icon64 = "/APK/BlAPK/MAIN.groovy"; // 64x64 icon
    icon128 = "/APK/BlAPK/MAIN.groovy"; // 128x128 icon
    icon256 = "/APK/BlAPK/MAIN.groovy"; // 256x256 icon
    icon512 = "/APK/BlAPK/MAIN.groovy"; // 512x512 icon
    icon1024 = "/APK/BlAPK/MAIN.groovy"; // 1024x1024 icon
    icon2048 = "/APK/BlAPK/MAIN.groovy"; // 2048x2048 icon
    break;
  }
  // Main method
  def main(void) {
    // Main method, returns all other methods
    return fileType();
    return selectVersion();
    return icon();
    break;
  }
  return main();
  break;
}
/* File info
File type: Groovy source file (*.groovy *.gvy *.gy *.gsh)
File version: 1 (2022, Saturday, January 8th at 9:13 pm)
Line count (including blank lines and compiler line): 50
*/
// End of script
