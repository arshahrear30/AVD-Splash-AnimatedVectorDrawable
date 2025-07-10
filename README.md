# AVD-Splash-AnimatedVectorDrawable

Adobe illustrator SVG File create 

implementation "androidx.core:core-splashscreen:1.0.0"

https://shapeshifter.design/

Youtube video : https://youtu.be/x3uekqdznf0

https://docs.google.com/document/d/1_BT-r41saAtm_zYptXQypJI1qSZLRnQpM6juN6X1BJI/edit?usp=sharing


AVD - Animation Vector Drawable. 

আমরা এখন vector কে animate করে themes-এর মাধ্যমে splash screen সেট করবো। API 25+ Android Nougat version থেকে এটি চলবে, কোনো extra activity প্রয়োজন হয় না।

Multiple XML
১. <!--res/drawable/ic_cross.xml-->
<vector>  
  <path  
    android:name="crossIcon"/>  
</vector>  
এইগুলো vector-এর point গুলোর code।
২. <!--res/animator/rotation.xml-->
<objectAnimator  //এই tag টা Animation file এবং vector file link করতে ব্যবহার করি  
  android:propertyName="rotation"/>  
আপনার vector-এ আপনি কোন animation apply করতে চান, তা আপনি নির্ধারিত করবেন।
৩. <!--res/drawable/avd.xml-->
<animated-vector> //এই tag টা Animation এবং vector file connect করতে ব্যবহার করি।  
  <target  
    android:name="cross Icon" //vector-এর জন্য  
    android:animation="@animator/rotation" /> //animation-এর জন্য  
</animated-vector>

এখানে আমরা animation vector-কে mention করবো। themes-এ এই file টা mention করে কাজ করলে splash show করবে।

Illustrator2022-এ 120×120 pixel নিয়ে create করবো। Logo-এর X: 60, Y: 60 এবং Height: 50, Width: 50।
At first আমরা image টা কে vector-এ convert করবো: Select =image copy and paste এবং Illustrator-এ window menu তে click করে =Image trace =Preset =High Fidelity Photo =Expand।

2nd work is : যেকোনো অতিরিক্ত background color/অংশ remove করা। View menu থেকে Show Transparency-তে click দিবো। 120×120-এর ভিতর transparency অংশে click দিবো। তারপর আমরা logo-র যে অংশটা remove করতে চাই, সেটার উপর click করবো, তারপর Fill color-এ click দিবো, color transparency-তে click করবো — ওই জায়গায় white-এর উপর একটা লাল দাগ শুরুতে যেটা থাকে।ঐটায় click করলে transparancy হয়ে যাবে অতিরিক্ত অংশ।

এরপর Save as svg format এ save করবো । 

এরপর shapeshifter.design/ এই site এ svg টা upload করে youtube video টা ফলো করো ।







<animated-vector>
    <aapt:attr name="android:drawable">
        <vector>
            <path
                android:name="iconCross"/>
        </vector>
    </aapt:attr>

    <target android:name="iconCross">
        <aapt:attr name="android:animation">
            <objectAnimator
                android:propertyName="rotation"/>
        </aapt:attr>
    </target>
</animated-vector>

