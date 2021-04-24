# Android Studio Java Custom Intent Service
This is my own custom intent service library with animation and bundle

Add it in your root build.gradle at the end of repositories:

for gradle //////////////////////////////////////

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  Step 2. Add the dependency
  
  dependencies {
	        implementation 'com.github.cosmohacker:Android-Studio-Java-Custom-Intent-Service:1.1.1'
	}

end of for gradle //////////////////////////////////////

for maven //////////////////////////////////////

<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
  Step 2. Add the dependency
  
  	<dependency>
	    <groupId>com.github.cosmohacker</groupId>
	    <artifactId>Android-Studio-Java-Custom-Intent-Service</artifactId>
	    <version>1.1.1</version>
	</dependency>

end of for maven //////////////////////////////////////

for sbt //////////////////////////////////////

Add it in your build.sbt at the end of resolvers:

  resolvers += "jitpack" at "https://jitpack.io"
  
  Step 2. Add the dependency
  
  	libraryDependencies += "com.github.cosmohacker" % "Android-Studio-Java-Custom-Intent-Service" % "1.1.1"	

end of for sbt //////////////////////////////////////

for leiningen //////////////////////////////////////

Add it in your project.clj at the end of repositories:

  repositories [["jitpack" "https://jitpack.io"]]
  
  Step 2. Add the dependency
	
	:dependencies [[com.github.cosmohacker/Android-Studio-Java-Custom-Intent-Service "1.1.1"]]	

end of for leiningen //////////////////////////////////////


#USAGE 
import com.cosmohacker.intentservice.IntentService;

/*
    Transmission Types{
    "left-right"
    right-left"
    "bottom-up"
    "up-bottom"
    "fadein-fadeout"
    "rotateout-rotatein"
    "fadeout-fadein"
    "rotatein-rotateout"
    }
*/

IntentService.intentAddress(Context mContext, Class forwardClass, String transmissionType);

IntentService.intentAddressSimple(Context mContext, Class forwardClass);

IntentService.intentAddressWithBundle(Context mContext, Class forwardClass, String transmissionType, Bundle bundle, String key, String content) ;

IntentService.intentAddressSimpleWithBundle(Context mContext, Class forwardClass, Bundle bundle, String key, String content);
