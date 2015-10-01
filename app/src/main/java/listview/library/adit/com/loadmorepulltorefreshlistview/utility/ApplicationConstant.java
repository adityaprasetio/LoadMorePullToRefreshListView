package listview.library.adit.com.loadmorepulltorefreshlistview.utility;

/**
 * Created by adityaprasetio on 1/21/15.
 */
public class ApplicationConstant {

    public static final int HTTP_TIMEOUT = 50000;
    public static final int RETROFIT_TIMEOUT = 0;
    public static final int RETROFIT_LOCATION_SUCCESS = 1;
    public static final int RETROFIT_LOGIN_SUCCESS = 2;
    public static final int RETROFIT_LOGIN_FAILED = 3;

    public static final int RETROFIT_LISTING_CALLBACK_LAND = 4;
    public static final int RETROFIT_LISTING_CALLBACK_HOUSE = 5;
    public static final int RETROFIT_LISTING_CALLBACK_APARTMENT = 6;
    public static final int RETROFIT_LISTING_CALLBACK_COMMERCIAL = 7;

    public static final int RETROFIT_FILTER_LISTING_CALLBACK_ONLINE = 14;
    public static final int RETROFIT_FILTER_LISTING_CALLBACK_PENDING = 15;
    public static final int RETROFIT_FILTER_LISTING_CALLBACK_SOLD = 16;

    public static final int RETROFIT_LISTING_CALLBACK_LAND_FAILED = 8;
    public static final int RETROFIT_LISTING_CALLBACK_HOUSE_FAILED = 11;
    public static final int RETROFIT_LISTING_CALLBACK_COMMERCIAL_FAILED = 9;
    public static final int RETROFIT_LISTING_CALLBACK_APARTMENT_FAILED = 10;
    public static final int RETROFIT_PROFILE_GET_SUCCESS = 12;
    public static final int RETROFIT_PROFILE_GET_FAILED = 13;

    public static final int RETROFIT_LISTING_CALLBACK_SEARCH = 14;
    public static final int RETROFIT_LISTING_CALLBACK_SEARCH_FAILED = 15;

    public static final int RETROFIT_LISTING_DETAIL = 16;
    public static final int RETROFIT_LISTING_DETAIL_FAILED = 17;

    public static final int RETROFIT_LISTING_CALLBACK_STATUS_UPDATE = 18;
    public static final int RETROFIT_LISTING_CALLBACK_STATUS_UPDATE_FAILED = 19;

    public static final int RETROFIT_LISTING_PHOTO_CALLBACK_STATUS_UPDATE = 20;
    public static final int RETROFIT_LISTING_PHOTO_CALLBACK_STATUS_UPDATE_FAILED = 21;

    public static final int RETROFIT_LISTING_CALLBACK_STATUS = 22;
    public static final int RETROFIT_LISTING_CALLBACK_STATUS_FAILED = 23;

    public static final int RETROFIT_LISTING_DETAIL_EDIT = 24;
    public static final int RETROFIT_LISTING_DETAIL_EDIT_FAILED = 25;

    public static final int RETROFIT_LISTING_CALLBACK_STATUS_PUBLIC = 26;
    public static final int RETROFIT_LISTING_CALLBACK_STATUS__PUBLIC_FAILED = 27;

    public static final int RETROFIT_UPDATE_FORCED = 28;

    public static final int RETROFIT_POST_FEEDBACK_SUCCESS = 29;
    public static final int RETROFIT_POST_FEEDBACK_FAILED = 30;

    public static final int RETROFIT_REQUEST_PASSWORD_SUCCESS = 31;
    public static final int RETROFIT_REQUEST_PASSWORD_FAILED = 32;

    public static final int RETROFIT_REGISTER_SUCCESS = 33;
    public static final int RETROFIT_REGISTER_FAILED = 34;

    public static final int RETROFIT_ANNOUNCEMENT_GET_SUCCESS = 35;
    public static final int RETROFIT_ANNOUNCEMENT_GET_FAILED = 36;
    public static final int RETROFIT_GET_ENQUIRIES_SUCCESS = 37;
    public static final int RETROFIT_GET_ENQUIRIES_FAILED = 38;

    public static final int RETROFIT_POST_DELETE_ENQUIRIES_SUCCESS = 39;
    public static final int RETROFIT_POST_DELETE_ENQUIRIES_FAILED = 40;

    public static final int RETROFIT_POST_READ_ENQUIRIES_SUCCESS = 41;
    public static final int RETROFIT_POST_READ_ENQUIRIES_FAILED = 42;

    public static final String AUTH_AUTHORIZATION = "Basic bW9iaWxlYXBwOnJhaGFzaWE=";
    public static final String AUTH_GRANT_TYPE = "password";
    public static final String AUTH_GRANT_TYPE_REFRESH = "refresh_token";
    public static final String AUTH_ACCEPTED = "Authorization accepted.";

    public static final String DATA_PROVINCE = "DATA_PROVINCE";
    public static final String DATA_CITY = "DATA_CITY";
    public static final String DATA_DISTRICT = "DATA_DISTRICT";

    public static final String LISTING_STATUS_PENDING = "pending";
    public static final String LISTING_STATUS_ONLINE = "online";
    public static final String LISTING_STATUS_SOLD = "sold";

    public static final String LISTING_STATUS_OFFLINE = "Offline";
    public static final String LISTING_STATUS_DELETED = "Deleted";
    public static final String LISTING_STATUS_READVERTISE = "Readvertise";
    public static final String LISTING_STATUS_REJECTED = "Rejected";
    public static final String LISTING_STATUS_DEAD = "Dead";

    public static final String VALIDATION_SPINNER_PROVICE = "^((?!Pilih Propinsi).)*$";
    public static final String VALIDATION_SPINNER_CITY = "^((?!Pilih Kota).)*$";
    public static final String VALIDATION_SPINNER_DISTRICT = "^((?!Pilih Area).)*$";

    public static final String VALIDATION_SPINNER_PROPERTY_TYPE = "^((?!Pilih Tipe Property).)*$";
    public static final String VALIDATION_SPINNER_COMERCIAL_TYPE = "^((?!Pilih Tipe Komersil).)*$";
    public static final String VALIDATION_SPINNER_APARTMENT_TYPE = "^((?!Pilih Nama Apartemen).)*$";

    public static final String VALIDATION_SPINNER_PRICE_OPTION = "^((?!Pilih Harga Ukuran).)*$";
    public static final String VALIDATION_SPINNER_RENT_PERIOD = "^((?!Pilih Periode Sewa).)*$";

    public static final String VALIDATION_TITLE_JUAL_SEWA = "(?i)^((?!jual|sewa).)*$";

    public static final String VALIDATION_EMAIL =
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+";

    public static final String CHANNEL_NAME = "AND";
    public static final String COMPANY_REGISTRATION_CODE = "c";
    public static final String INDEPENDENT_REGISTRATION_CODE = "i";

}