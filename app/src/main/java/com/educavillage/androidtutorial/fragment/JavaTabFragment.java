package com.educavillage.androidtutorial.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.educavillage.androidtutorial.R;
import com.educavillage.androidtutorial.activity.JavaAllTopicsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by faiz on 16-Jan-18.
 */
public class JavaTabFragment extends Fragment implements View.OnClickListener {

             @BindView(R.id.txt_java_overview) TextView overview;
             @BindView(R.id.txt_java_environment_setup) TextView environmentSetup;
             @BindView(R.id.txt_history_of_java) TextView historyOfJava;
             @BindView(R.id.txt_java_what_is_java) TextView whatIsJava;
             @BindView(R.id.txt_features_of_java) TextView featuresOfJava;
             @BindView(R.id.txt_java_difference_between_JDK_JRE_JVM) TextView differenceBetweenJDK_JRE_JVM;
             @BindView(R.id.txt_java_JVM) TextView jVM;
             @BindView(R.id.txt_java_basic_syntax) TextView basicSyntax;
             @BindView(R.id.txt_java_objects_an_classes) TextView objectsAndClasses;
             @BindView(R.id.txt_java_basic_data_type) TextView basicDataTypes;
             @BindView(R.id.txt_java_variable_types) TextView variableTypes;
             @BindView(R.id.txt_java_modifier_types) TextView modifireTypes;
             @BindView(R.id.txt_java_basic_operators) TextView basicOperator;
             @BindView(R.id.txt_java_loops) TextView loops;
             @BindView(R.id.txt_java_decision_making) TextView decisionMaking;
             @BindView(R.id.txt_numbers_class_in_java) TextView numbersClass;
             @BindView(R.id.txt_character_class_in_java) TextView characterClass;
             @BindView(R.id.txt_strings_class_in_java) TextView stringClass;
             @BindView(R.id.txt_arrays_in_java) TextView arrays;
             @BindView(R.id.txt_date_and_time_in_java) TextView dateAndTime;
             @BindView(R.id.txt_regular_expressions_in_java) TextView regularExpressions;
             @BindView(R.id.txt_java_methods) TextView methods;
             @BindView(R.id.txt_streams_files_and_io_in_java) TextView streamsFilesAndIO;
             @BindView(R.id.txt_exceptions_handling_in_java) TextView exceptionsHandling;
             @BindView(R.id.txt_inheritance_in_java) TextView inheritance;
             @BindView(R.id.txt_overriding_in_java) TextView overriding;
             @BindView(R.id.txt_polymorphism_in_java) TextView polymorphism;
             @BindView(R.id.txt_abstraction_in_java) TextView abstraction;
             @BindView(R.id.txt_encapsulation_in_java) TextView encapsulation;
             @BindView(R.id.txt_interfaces_in_java) TextView interfaces;
             @BindView(R.id.txt_packages_in_java) TextView packages;
             @BindView(R.id.txt_data_structures_in_java) TextView dataStructures;
             @BindView(R.id.txt_collections_framework_in_java) TextView collectionsFramework;
             @BindView(R.id.txt_generics_in_java) TextView generics;
             @BindView(R.id.txt_serialization_in_java) TextView serialization;
             @BindView(R.id.txt_networking_in_java) TextView network;
             @BindView(R.id.txt_sending_mail_in_java) TextView sendMail;
             @BindView(R.id.txt_multithreading_in_java) TextView multithreading;
             @BindView(R.id.txt_applet_basics_in_java) TextView appletBasics;
             @BindView(R.id.txt_documentation_comments) TextView documentationComments;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.java_tab_fragment, container, false);
        ButterKnife.bind(this, view);

        overview.setOnClickListener(this);
        environmentSetup.setOnClickListener(this);
        historyOfJava.setOnClickListener(this);
        whatIsJava.setOnClickListener(this);
        featuresOfJava.setOnClickListener(this);
        differenceBetweenJDK_JRE_JVM.setOnClickListener(this);
        jVM.setOnClickListener(this);
        basicSyntax.setOnClickListener(this);
        objectsAndClasses.setOnClickListener(this);
        basicDataTypes.setOnClickListener(this);
        variableTypes.setOnClickListener(this);
        modifireTypes.setOnClickListener(this);
        basicOperator.setOnClickListener(this);
        loops.setOnClickListener(this);
        decisionMaking.setOnClickListener(this);
        numbersClass.setOnClickListener(this);
        characterClass.setOnClickListener(this);
        stringClass.setOnClickListener(this);
        arrays.setOnClickListener(this);
        dateAndTime.setOnClickListener(this);
        regularExpressions.setOnClickListener(this);
        methods.setOnClickListener(this);
        streamsFilesAndIO.setOnClickListener(this);
        exceptionsHandling.setOnClickListener(this);
        inheritance.setOnClickListener(this);
        overriding.setOnClickListener(this);
        polymorphism.setOnClickListener(this);
        abstraction.setOnClickListener(this);
        encapsulation.setOnClickListener(this);
        interfaces.setOnClickListener(this);
        packages.setOnClickListener(this);
        dataStructures.setOnClickListener(this);
        collectionsFramework.setOnClickListener(this);
        generics.setOnClickListener(this);
        serialization.setOnClickListener(this);
        network.setOnClickListener(this);
        sendMail.setOnClickListener(this);
        multithreading.setOnClickListener(this);
        appletBasics.setOnClickListener(this);
        documentationComments.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_java_overview:
                Intent overviewIntent = new Intent(getActivity(), JavaAllTopicsActivity.class);
                overviewIntent.putExtra("url1","file:///android_asset/javaOverview.html");
                this.startActivity(overviewIntent);
                break;
            case R.id.txt_java_environment_setup:
                Intent environmentSetupIntent = new Intent(getContext(), JavaAllTopicsActivity.class);
                environmentSetupIntent.putExtra("url2","file:///android_asset/javaEnvironmentSetup.html");
                this.startActivity(environmentSetupIntent);
                break;
            case R.id.txt_history_of_java:
                Intent historyOfJavaIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                historyOfJavaIntent.putExtra("url3","file:///android_asset/javaHistoryOfJava.html");
                this.startActivity(historyOfJavaIntent);
                break;
            case R.id.txt_java_what_is_java:
                Intent whatIsJavaIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                whatIsJavaIntent.putExtra("url4","file:///android_asset/javaWhatIsJava.html");
                this.startActivity(whatIsJavaIntent);
                break;
            case R.id.txt_features_of_java:
                Intent featuresOfJavaIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
               featuresOfJavaIntent.putExtra("url5","file:///android_asset/javaFeaturesOfJava.html");
                this.startActivity(featuresOfJavaIntent);
                break;
            case R.id.txt_java_difference_between_JDK_JRE_JVM:
                Intent differenceBetweenJDKJVMJREIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                differenceBetweenJDKJVMJREIntent.putExtra("url6","file:///android_asset/javaDifferenceBetweenJDK,JRE,JVM.html");
                this.startActivity(differenceBetweenJDKJVMJREIntent);
                break;
            case R.id.txt_java_JVM:
                Intent jVMIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                jVMIntent.putExtra("url7","file:///android_asset/javaJVM.html");
                this.startActivity(jVMIntent);
                break;
            case R.id.txt_java_basic_syntax:
                Intent basicSyntaxIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                basicSyntaxIntent.putExtra("url8","file:///android_asset/javaBasicSyntax.html");
                this.startActivity(basicSyntaxIntent);
                break;
            case R.id.txt_java_objects_an_classes:
                Intent objectAndClassIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
               objectAndClassIntent.putExtra("url9","file:///android_asset/javaObjectClass.html");
                this.startActivity(objectAndClassIntent);
                break;
            case R.id.txt_java_basic_data_type:
                Intent basicDataTypesIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                basicDataTypesIntent.putExtra("url10","file:///android_asset/javaBasicDataTypes.html");
                this.startActivity(basicDataTypesIntent);
                break;
            case R.id.txt_java_variable_types:
                Intent variableTypesIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                variableTypesIntent.putExtra("url11","file:///android_asset/JavaVariableTypes.html");
                this.startActivity(variableTypesIntent);
                break;
            case R.id.txt_java_modifier_types:
                Intent modifierTypesIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                modifierTypesIntent.putExtra("url12","file:///android_asset/javaModifierTypes.html");
                this.startActivity(modifierTypesIntent);
                break;
            case R.id.txt_java_basic_operators:
                Intent basicOperatorsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                basicOperatorsIntent.putExtra("url13","file:///android_asset/javaBasicOperators.html");
                this.startActivity(basicOperatorsIntent);
                break;
            case R.id.txt_java_loops:
                Intent loopsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                loopsIntent.putExtra("url14","file:///android_asset/javaLoops.html");
                this.startActivity(loopsIntent);
                break;
            case R.id.txt_java_decision_making:
                Intent decisionMakingIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                decisionMakingIntent.putExtra("url15","file:///android_asset/javaDecisionMaking.html");
                this.startActivity(decisionMakingIntent);
                break;
            case R.id.txt_numbers_class_in_java:
                Intent numberClassIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                numberClassIntent.putExtra("url16","file:///android_asset/javaNumbersClass.html");
                this.startActivity(numberClassIntent);
                break;
            case R.id.txt_character_class_in_java:
                Intent characterClassIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                characterClassIntent.putExtra("url17","file:///android_asset/javaCharacterClass.html");
                this.startActivity(characterClassIntent);
                break;
            case R.id.txt_strings_class_in_java:
                Intent stringsClassIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                stringsClassIntent.putExtra("url18","file:///android_asset/javaStringClass.html");
                this.startActivity(stringsClassIntent);
                break;
            case R.id.txt_arrays_in_java:
                Intent arraysIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                arraysIntent.putExtra("url19","file:///android_asset/javaArrays.html");
                this.startActivity(arraysIntent);
                break;
            case R.id.txt_date_and_time_in_java:
                Intent dateAndTimeIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                dateAndTimeIntent.putExtra("url20","file:///android_asset/javaDateAndTime.html");
                this.startActivity(dateAndTimeIntent);
                break;
            case R.id.txt_regular_expressions_in_java:
                Intent regularExpressionsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                regularExpressionsIntent.putExtra("url21","file:///android_asset/javaRegularExpressions.html");
                this.startActivity(regularExpressionsIntent);
                break;
            case R.id.txt_java_methods:
                Intent methodsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                methodsIntent.putExtra("url22","file:///android_asset/javaMethods.html");
                this.startActivity(methodsIntent);
                break;
            case R.id.txt_streams_files_and_io_in_java:
                Intent streamsFilesAndIOIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                streamsFilesAndIOIntent.putExtra("url23","file:///android_asset/javaStreamsFilesAndIO.html");
                this.startActivity(streamsFilesAndIOIntent);
                break;
            case R.id.txt_exceptions_handling_in_java:
                Intent exceptionsHandlingIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                exceptionsHandlingIntent.putExtra("url24","file:///android_asset/javaExceptionsHandling.html");
                this.startActivity(exceptionsHandlingIntent);
                break;
            case R.id.txt_inheritance_in_java:
                Intent inheritanceIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                inheritanceIntent.putExtra("url25","file:///android_asset/javaInheritance.html");
                this.startActivity(inheritanceIntent);
                break;
            case R.id.txt_overriding_in_java:
                Intent overridingIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                overridingIntent.putExtra("url26","file:///android_asset/javaOverriding.html");
                this.startActivity(overridingIntent);
                break;
                case R.id.txt_polymorphism_in_java:
                Intent polymorphismIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                polymorphismIntent.putExtra("url27","file:///android_asset/javaPolymorphism.html");
                this.startActivity(polymorphismIntent);
                break;
            case R.id.txt_abstraction_in_java:
                Intent abstractionIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                abstractionIntent.putExtra("url28","file:///android_asset/javaAbstraction.html");
                this.startActivity(abstractionIntent);
                break;
            case R.id.txt_encapsulation_in_java:
                Intent encapsulationIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                encapsulationIntent.putExtra("url29","file:///android_asset/javaEncapsulation.html");
                this.startActivity(encapsulationIntent);
                break;
            case R.id.txt_interfaces_in_java:
                Intent interfacesIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                interfacesIntent.putExtra("url30","file:///android_asset/javaInterfaces.html");
                this.startActivity(interfacesIntent);
                break;
            case R.id.txt_packages_in_java:
                Intent packagesIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                packagesIntent.putExtra("url31","file:///android_asset/javaPackages.html");
                this.startActivity(packagesIntent);
                break;
            case R.id.txt_data_structures_in_java:
                Intent dataStructuresIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                dataStructuresIntent.putExtra("url32","file:///android_asset/javaDataStructures.html");
                this.startActivity(dataStructuresIntent);
                break;
            case R.id.txt_collections_framework_in_java:
                Intent collectionsFrameworkIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                collectionsFrameworkIntent.putExtra("url33","file:///android_asset/javaCollectionsFramework.html");
                this.startActivity(collectionsFrameworkIntent);
                break;
            case R.id.txt_generics_in_java:
                Intent genericsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                genericsIntent.putExtra("url34","file:///android_asset/javaGenerics.html");
                this.startActivity(genericsIntent);
                break;
            case R.id.txt_serialization_in_java:
                Intent serializationIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                serializationIntent.putExtra("url35","file:///android_asset/javaSerialization.html");
                this.startActivity(serializationIntent);
                break;
            case R.id.txt_networking_in_java:
                Intent networkingIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                networkingIntent.putExtra("url36","file:///android_asset/javaNetworking.html");
                this.startActivity(networkingIntent);
                break;
            case R.id.txt_sending_mail_in_java:
                Intent sendingMailIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                sendingMailIntent.putExtra("url37","file:///android_asset/javaSendingEmail.html");
                this.startActivity(sendingMailIntent);
                break;
            case R.id.txt_multithreading_in_java:
                Intent multithreadingIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                multithreadingIntent.putExtra("url38","file:///android_asset/javaMultithreading.html");
                this.startActivity(multithreadingIntent);
                break;
            case R.id.txt_applet_basics_in_java:
                Intent appletBasicsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                appletBasicsIntent.putExtra("url39","file:///android_asset/javaAppletBasics.html");
                this.startActivity(appletBasicsIntent);
                break;
            case R.id.txt_documentation_comments:
                Intent documentationCommentsIntent=new Intent(getContext(),JavaAllTopicsActivity.class);
                documentationCommentsIntent.putExtra("url40","file:///android_asset/javaDocumentationComments.html");
                this.startActivity(documentationCommentsIntent);
                break;













        }

    }
}