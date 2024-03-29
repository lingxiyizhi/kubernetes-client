

# V1WebhookConversion

WebhookConversion describes how to call a conversion webhook

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientConfig** | [**ApiextensionsV1WebhookClientConfig**](ApiextensionsV1WebhookClientConfig.md) |  |  [optional] |
|**conversionReviewVersions** | **List&lt;String&gt;** | conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. |  |



