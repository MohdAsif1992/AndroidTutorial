package com.educavillage.androidtutorial.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.educavillage.androidtutorial.R;
import com.educavillage.androidtutorial.activity.AndroidAllTopicsActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by faiz on 16-Jan-18.
 */
public class AndroidTabFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.txt_android_overview) TextView overview;
    @BindView(R.id.txt_android_environment_setup) TextView environmentSetup;
    @BindView(R.id.txt_android_architecture) TextView architecture;
    @BindView(R.id.txt_android_application_components) TextView applicationComponent;
    @BindView(R.id.txt_android_hello_world_example) TextView helloWordExample;
    @BindView(R.id.txt_android_resources_organizing) TextView resourcesOrganizing;
    @BindView(R.id.txt_android_activities) TextView activities;
    @BindView(R.id.txt_android_services) TextView services;
    @BindView(R.id.txt_android_broadcast_receivers) TextView broadcastReceivers;
    @BindView(R.id.txt_android_content_providers) TextView contentProviders;
    @BindView(R.id.txt_android_fragments) TextView fragments;
    @BindView(R.id.txt_android_intents_and_filters) TextView intentsAndFilters;
    @BindView(R.id.txt_android_styles_and_themes) TextView stylesAndThemes;
    @BindView(R.id.txt_android_custom_components) TextView customComponents;
    @BindView(R.id.txt_android_ui_layouts) TextView uiLayouts;
    @BindView(R.id.txt_android_ui_controls) TextView uiControls;
    @BindView(R.id.txt_android_event_handling) TextView eventHandling;
    @BindView(R.id.txt_android_drag_and_drop) TextView dragAndDrop;
    @BindView(R.id.txt_android_notifications) TextView notifications;
    @BindView(R.id.txt_android_location_based_services) TextView locationBasedServices;
    @BindView(R.id.txt_android_sending_email) TextView sendingEmail;
    @BindView(R.id.txt_android_sending_sms) TextView sendingSMS;
    @BindView(R.id.txt_android_phone_calls) TextView phoneCalls;
    @BindView(R.id.txt_android_publishing_application) TextView publishingApplication;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.android_tab_fragment, container, false);
        ButterKnife.bind(this, view);

        overview.setOnClickListener(this);
        environmentSetup.setOnClickListener(this);
        architecture.setOnClickListener(this);
        applicationComponent.setOnClickListener(this);
        helloWordExample.setOnClickListener(this);
        resourcesOrganizing.setOnClickListener(this);
        activities.setOnClickListener(this);
        services.setOnClickListener(this);
        broadcastReceivers.setOnClickListener(this);
        contentProviders.setOnClickListener(this);
        fragments.setOnClickListener(this);
        intentsAndFilters.setOnClickListener(this);
        stylesAndThemes.setOnClickListener(this);
        customComponents.setOnClickListener(this);
        uiLayouts.setOnClickListener(this);
        uiControls.setOnClickListener(this);
        eventHandling.setOnClickListener(this);
        dragAndDrop.setOnClickListener(this);
        notifications.setOnClickListener(this);
        locationBasedServices.setOnClickListener(this);
        sendingEmail.setOnClickListener(this);
        sendingSMS.setOnClickListener(this);
        phoneCalls.setOnClickListener(this);
        publishingApplication.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_android_overview:
                Intent androidOverviewIntent = new Intent(getActivity(), AndroidAllTopicsActivity.class);
                androidOverviewIntent.putExtra("url1", "file:///android_asset/android_Overview.html");
                this.startActivity(androidOverviewIntent);
                break;
            case R.id.txt_android_environment_setup:
                Intent androidEnvironmentSetupIntent = new Intent(getContext(), AndroidAllTopicsActivity.class);
               androidEnvironmentSetupIntent.putExtra("url2", "file:///android_asset/androidEnvironmentSetup.html");
                this.startActivity(androidEnvironmentSetupIntent);
                break;
            case R.id.txt_android_architecture:
                Intent architectureIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                architectureIntent.putExtra("url3", "file:///android_asset/androidArchitecture.html");
                this.startActivity(architectureIntent);
                break;
            case R.id.txt_android_application_components:
                Intent applicationComponentsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                applicationComponentsIntent.putExtra("url4", "file:///android_asset/androidApplicationComponents.html");
                this.startActivity(applicationComponentsIntent);
                break;
            case R.id.txt_android_hello_world_example:
                Intent helloWorldExampleIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                helloWorldExampleIntent.putExtra("url5", "file:///android_asset/androidHelloWorldExample.html");
                this.startActivity(helloWorldExampleIntent);
                break;
            case R.id.txt_android_resources_organizing:
                Intent resourcesOrganizingIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               resourcesOrganizingIntent.putExtra("url6", "file:///android_asset/androidResourcesOrganizing.html");
                this.startActivity(resourcesOrganizingIntent);
                break;
            case R.id.txt_android_activities:
                Intent activitiesIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               activitiesIntent.putExtra("url7", "file:///android_asset/androidActivities.html");
                this.startActivity(activitiesIntent);
                break;
            case R.id.txt_android_services:
                Intent servicesIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
              servicesIntent.putExtra("url8", "file:///android_asset/androidServices.html");
                this.startActivity(servicesIntent);
                break;
            case R.id.txt_android_broadcast_receivers:
                Intent broadcastReceiversIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               broadcastReceiversIntent.putExtra("url9", "file:///android_asset/androidBroadcastReceivers.html");
                this.startActivity(broadcastReceiversIntent);
                break;
            case R.id.txt_android_content_providers:
                Intent contentProviders=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                contentProviders.putExtra("url10", "file:///android_asset/androidContentProviders.html");
                this.startActivity(contentProviders);
                break;

            case R.id.txt_android_fragments:
                Intent fragmentsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                fragmentsIntent.putExtra("url11", "file:///android_asset/androidFragments.html");
                this.startActivity(fragmentsIntent);
                break;
            case R.id.txt_android_intents_and_filters:
                Intent intentsAndFiltersIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                intentsAndFiltersIntent.putExtra("url12", "file:///android_asset/androidIntentsAndFilters.html");
                this.startActivity(intentsAndFiltersIntent);
                break;
            case R.id.txt_android_styles_and_themes:
                Intent stylesAndThemesIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                stylesAndThemesIntent.putExtra("url13", "file:///android_asset/androidStylesAndThemes.html");
                this.startActivity(stylesAndThemesIntent);
                break;
            case R.id.txt_android_custom_components:
                Intent customComponents=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                customComponents.putExtra("url14", "file:///android_asset/androidCustomComponents.html");
                this.startActivity(customComponents);
                break;
            case R.id.txt_android_ui_layouts:
                Intent uiLayoutsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               uiLayoutsIntent.putExtra("url15", "file:///android_asset/androidUILayouts.html");
                this.startActivity(uiLayoutsIntent);
                break;
            case R.id.txt_android_ui_controls:
                Intent uiControlsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                uiControlsIntent.putExtra("url16", "file:///android_asset/androidUIControls.html");
                this.startActivity(uiControlsIntent);
                break;
            case R.id.txt_android_event_handling:
                Intent eventHandlingIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                eventHandlingIntent.putExtra("url17", "file:///android_asset/androidEventHandling.html");
                this.startActivity(eventHandlingIntent);
                break;case R.id.txt_android_drag_and_drop:
                Intent dragAndDropIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               dragAndDropIntent.putExtra("url18", "file:///android_asset/androidDragAndDrop.html");
                this.startActivity(dragAndDropIntent);
                break;

            case R.id.txt_android_notifications:
                Intent notificationsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                notificationsIntent.putExtra("url19", "file:///android_asset/androidNotifications.html");
                this.startActivity(notificationsIntent);
                break;
            case R.id.txt_android_location_based_services:
                Intent locationBasedServicesIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                locationBasedServicesIntent.putExtra("url20", "file:///android_asset/androidLocationBasedServices.html");
                this.startActivity(locationBasedServicesIntent);
                break;
            case R.id.txt_android_sending_email:
                Intent sendingEmailIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                sendingEmailIntent.putExtra("url21", "file:///android_asset/androidSendingEmail.html");
                this.startActivity(sendingEmailIntent);
                break;
            case R.id.txt_android_sending_sms:
                Intent sendingSMSIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
               sendingSMSIntent.putExtra("url22", "file:///android_asset/androidSendingSMS.html");
                this.startActivity(sendingSMSIntent);
                break;
            case R.id.txt_android_phone_calls:
                Intent phoneCallsIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                phoneCallsIntent.putExtra("url23", "file:///android_asset/androidPhoneCalls.html");
                this.startActivity(phoneCallsIntent);
                break;
            case R.id.txt_android_publishing_application:
                Intent publishingApplicationIntent=new Intent(getActivity(), AndroidAllTopicsActivity.class);
                publishingApplicationIntent.putExtra("url24", "file:///android_asset/publishingAndroidApplication.html");
                this.startActivity(publishingApplicationIntent);
                break;
        }
    }
}

