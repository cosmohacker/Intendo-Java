# Android : Java Custom Intent Service
This is my own custom intent service library with animation and bundle

Add it in your root build.gradle at the end of repositories:

<h1>GRADLE</h1>

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.cosmohacker:Intendo-Java:1.1.1'
	}

<h1>MAVEN</h1>

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
  Step 2. Add the dependency
  
  	<dependency>
	    <groupId>com.github.cosmohacker</groupId>
	    <artifactId>Intendo-Java</artifactId>
	    <version>1.1.1</version>
	</dependency>

<h1>SBT</h1>

Add it in your build.sbt at the end of resolvers:

 	 resolvers += "jitpack" at "https://jitpack.io"
  
  Step 2. Add the dependency
  
  	libraryDependencies += "com.github.cosmohacker" % "Intendo-Java" % "1.1.1"	

<h1>LEININGEN</h1>

Add it in your project.clj at the end of repositories:

  	repositories [["jitpack" "https://jitpack.io"]]
  
  Step 2. Add the dependency
	
	:dependencies [[com.github.cosmohacker/Intendo-Java "1.1.1"]]	

<h1>USAGE</h1>

	import com.cosmohacker.intentservice.IntentService;
		    
	IntentService.intentAddress(Context mContext, Class forwardClass, String transmissionType);

	IntentService.intentAddressSimple(Context mContext, Class forwardClass);

	IntentService.intentAddressWithBundle(Context mContext, Class forwardClass, String transmissionType, Bundle bundle, String key, String content) ;

	IntentService.intentAddressSimpleWithBundle(Context mContext, Class forwardClass, Bundle bundle, String key, String content);

<h3>Transmission Types</h3>
<hr>
    "left-right"
    <br>
    "right-left"
    <br>
    "bottom-up"
    <br>
    "up-bottom"
    <br>
    "fadein-fadeout"
    <br>
    "fadeout-fadein"
    <br>
    "rotateout-rotatein"
    <br>
    "rotatein-rotateout"
