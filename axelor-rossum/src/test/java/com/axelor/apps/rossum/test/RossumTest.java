package com.axelor.apps.rossum.test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import wslite.json.JSONArray;
import wslite.json.JSONException;
import wslite.json.JSONObject;

public class RossumTest {

  @Test
  public void generateUniqueKey() {
    System.err.println("hello");
    try {
      JSONObject result =
          new JSONObject(
              "{\"preview\":\"https://all.rir.rossum.ai/img/16c9543c23ff46008b542765_0.png\",\"tables\":[{\"column_types\":[\"table_column_description\",\"table_column_rate\",\"table_column_quantity\",\"table_column_amount\",\"table_column_amount_total\",\"table_column_other\"],\"bbox\":[60,348,1127,455],\"page\":0,\"rows\":[{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,348,299,373],\"value\":\"Description\",\"content\":\"Description\"},{\"value_type\":\"text\",\"bbox\":[468,348,533,373],\"value\":\"TVA\",\"content\":\"TVA\"},{\"value_type\":\"text\",\"bbox\":[612,348,707,373],\"value\":\"Qté / Unité\",\"content\":\"Qté / Unité\"},{\"value_type\":\"text\",\"bbox\":[780,348,917,373],\"value\":\"Prix unitaire\",\"content\":\"Prix unitaire\"},{\"value_type\":\"text\",\"bbox\":[1002,348,1080,373],\"value\":\"Prix HT\",\"content\":\"Prix HT\"},{\"value_type\":\"text\",\"bbox\":[1081,348,1127,373],\"value\":\"\",\"content\":\"\"}],\"type\":\"header\"},{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,374,299,401],\"value\":\"High Performance Server\",\"content\":\"High Performance Server\"},{\"value_type\":\"number\",\"bbox\":[468,374,533,401],\"value\":\"20.00\",\"content\":\"20.00%\"},{\"value_type\":\"number\",\"bbox\":[612,374,707,401],\"value\":\"10.00\",\"content\":\"10.00 Unit\"},{\"value_type\":\"number\",\"bbox\":[780,374,917,401],\"value\":\"2500.00\",\"content\":\"2,500.00\"},{\"value_type\":\"number\",\"bbox\":[1002,374,1080,401],\"value\":\"25000.00\",\"content\":\"25,000.00\"},{\"value_type\":\"text\",\"bbox\":[1081,374,1127,401],\"value\":\"EUR\",\"content\":\"EUR\"}],\"type\":\"data\"},{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,432,299,455],\"value\":\"Laser Printer\",\"content\":\"Laser Printer\"},{\"value_type\":\"number\",\"bbox\":[468,432,533,455],\"value\":\"20.00\",\"content\":\"20.00%\"},{\"value_type\":\"number\",\"bbox\":[612,432,707,455],\"value\":\"6.00\",\"content\":\"6.00 Unit\"},{\"value_type\":\"number\",\"bbox\":[780,432,917,455],\"value\":\"429.00\",\"content\":\"429.00\"},{\"value_type\":\"number\",\"bbox\":[1002,432,1080,455],\"value\":\"2574.00\",\"content\":\"2,574.00\"},{\"value_type\":\"text\",\"bbox\":[1081,432,1127,455],\"value\":\"EUR\",\"content\":\"EUR\"}],\"type\":\"data\"}]},{\"column_types\":[\"table_column_description\",\"table_column_rate\",\"table_column_quantity\",\"table_column_amount\",\"table_column_amount_total\",\"table_column_other\"],\"bbox\":[60,348,1127,455],\"page\":1,\"rows\":[{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,348,299,373],\"value\":\"Description\",\"content\":\"Description\"},{\"value_type\":\"text\",\"bbox\":[468,348,533,373],\"value\":\"TVA\",\"content\":\"TVA\"},{\"value_type\":\"text\",\"bbox\":[612,348,707,373],\"value\":\"Qté / Unité\",\"content\":\"Qté / Unité\"},{\"value_type\":\"text\",\"bbox\":[780,348,917,373],\"value\":\"Prix unitaire\",\"content\":\"Prix unitaire\"},{\"value_type\":\"text\",\"bbox\":[1002,348,1080,373],\"value\":\"Prix HT\",\"content\":\"Prix HT\"},{\"value_type\":\"text\",\"bbox\":[1081,348,1127,373],\"value\":\"\",\"content\":\"\"}],\"type\":\"header\"},{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,374,299,401],\"value\":\"High Performance Server\",\"content\":\"High Performance Server\"},{\"value_type\":\"number\",\"bbox\":[468,374,533,401],\"value\":\"20.00\",\"content\":\"20.00%\"},{\"value_type\":\"number\",\"bbox\":[612,374,707,401],\"value\":\"10.00\",\"content\":\"10.00 Unit\"},{\"value_type\":\"number\",\"bbox\":[780,374,917,401],\"value\":\"2500.00\",\"content\":\"2,500.00\"},{\"value_type\":\"number\",\"bbox\":[1002,374,1080,401],\"value\":\"25000.00\",\"content\":\"25,000.00\"},{\"value_type\":\"text\",\"bbox\":[1081,374,1127,401],\"value\":\"EUR\",\"content\":\"EUR\"}],\"type\":\"data\"},{\"cells\":[{\"value_type\":\"text\",\"bbox\":[60,432,299,455],\"value\":\"Laser Printer\",\"content\":\"Laser Printer\"},{\"value_type\":\"number\",\"bbox\":[468,432,533,455],\"value\":\"20.00\",\"content\":\"20.00%\"},{\"value_type\":\"number\",\"bbox\":[612,432,707,455],\"value\":\"6.00\",\"content\":\"6.00 Unit\"},{\"value_type\":\"number\",\"bbox\":[780,432,917,455],\"value\":\"429.00\",\"content\":\"429.00\"},{\"value_type\":\"number\",\"bbox\":[1002,432,1080,455],\"value\":\"2574.00\",\"content\":\"2,574.00\"},{\"value_type\":\"text\",\"bbox\":[1081,432,1127,455],\"value\":\"EUR\",\"content\":\"EUR\"}],\"type\":\"data\"}]}],\"payment_state\":\"manual\",\"original_pages\":[\"https://all.rir.rossum.ai/img/o_16c9543c23ff46008b542765_0.png\",\"https://all.rir.rossum.ai/img/o_16c9543c23ff46008b542765_1.png\"],\"previews\":[\"https://all.rir.rossum.ai/img/16c9543c23ff46008b542765_0.png\",\"https://all.rir.rossum.ai/img/16c9543c23ff46008b542765_1.png\"],\"language\":\"fra\",\"invoice_type\":\"tax_invoice\",\"currency\":\"eur\",\"fields\":[{\"score\":0.9758064516129014,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1025,576,1127,612],\"name\":\"amount_due\",\"page\":1,\"title\":\"Amount Due\",\"value\":\"33088.80\",\"content\":\"33,088.80\"},{\"score\":0.9840434804886053,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1025,576,1127,612],\"name\":\"amount_total\",\"page\":1,\"title\":\"Total Amount\",\"value\":\"33088.80\",\"content\":\"33,088.80\"},{\"score\":0.9119141524062472,\"value_type\":\"number\",\"checks\":{},\"bbox\":[1025,522,1125,552],\"name\":\"amount_total_base\",\"page\":1,\"title\":\"Tax Base Total\",\"value\":\"27574.00\",\"content\":\"27,574.00\"},{\"score\":0.9405407880299763,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1040,546,1128,582],\"name\":\"amount_total_tax\",\"page\":1,\"title\":\"Tax Total\",\"value\":\"5514.80\",\"content\":\"5,514.80\"},{\"score\":0.9797584864436254,\"value_type\":\"text\",\"checks\":{},\"bbox\":[776,678,916,708],\"name\":\"bic\",\"page\":1,\"title\":\"BIC/SWIFT\",\"value\":\"CCCCFRPPXXX\",\"content\":\"CCCCFRPPXXX\"},{\"score\":0.7606410580431894,\"value_type\":\"text\",\"checks\":{},\"bbox\":[183,294,231,324],\"name\":\"customer_id\",\"page\":1,\"title\":\"Customer Number\",\"value\":\"8736\",\"content\":\"8736\"},{\"score\":0.9715412694377914,\"value_type\":\"date\",\"checks\":{},\"bbox\":[200,186,308,216],\"name\":\"date_issue\",\"page\":1,\"title\":\"Issue Date\",\"value\":\"2019-05-27\",\"content\":\"27/05/2019\"},{\"score\":0.9948717948717949,\"value_type\":\"text\",\"checks\":{},\"bbox\":[773,648,1093,678],\"name\":\"iban\",\"page\":1,\"title\":\"IBAN\",\"value\":\"FR76 9933 3031 0076 2834 0661 022\",\"content\":\"FR76 9933 3031 0076 2834 0661 022\"},{\"score\":0.6867999732674478,\"value_type\":\"text\",\"checks\":{},\"bbox\":[251,252,347,282],\"name\":\"order_id\",\"page\":1,\"title\":\"Order Number\",\"value\":\"SO00001\",\"content\":\"SO00001\"},{\"score\":0.4142389734599369,\"value_type\":\"text\",\"checks\":{},\"bbox\":[771,186,995,330],\"name\":\"recipient_address\",\"page\":1,\"title\":\"Recipient Address\",\"value\":\"123 Services\\nROGER Jean Marc\\n40 RUE ABELARD\\n59000 LILLE\\nFRANCE\",\"content\":\"123 Services\\nROGER Jean Marc\\n40 RUE ABELARD\\n59000 LILLE\\nFRANCE\"},{\"score\":0.16614329962216906,\"value_type\":\"text\",\"checks\":{},\"bbox\":[775,186,925,216],\"name\":\"recipient_addrline\",\"page\":1,\"title\":\"Recipient Address Line\",\"value\":\"123 Services\",\"content\":\"123 Services\"},{\"score\":0.7878622231784782,\"value_type\":\"text\",\"checks\":{},\"bbox\":[779,240,971,276],\"name\":\"recipient_addrline\",\"page\":1,\"title\":\"Recipient Address Line\",\"value\":\"40 RUE ABELARD\",\"content\":\"40 RUE ABELARD\"},{\"score\":0.7313952608550288,\"value_type\":\"text\",\"checks\":{},\"bbox\":[779,270,909,306],\"name\":\"recipient_addrline\",\"page\":1,\"title\":\"Recipient Address Line\",\"value\":\"59000 LILLE\",\"content\":\"59000 LILLE\"},{\"score\":0.5035684622691541,\"value_type\":\"text\",\"checks\":{},\"bbox\":[771,300,959,330],\"name\":\"recipient_addrline\",\"page\":1,\"title\":\"Recipient Address Line\",\"value\":\"FRANCE\",\"content\":\"FRANCE\"},{\"score\":0.6997448970255341,\"value_type\":\"text\",\"checks\":{},\"bbox\":[775,210,995,246],\"name\":\"recipient_addrline\",\"page\":1,\"title\":\"Recipient Address Line\",\"value\":\"ROGER Jean Marc\",\"content\":\"ROGER Jean Marc\"},{\"score\":0.8868030911080893,\"value_type\":\"text\",\"checks\":{},\"bbox\":[828,30,1086,78],\"name\":\"sender_address\",\"page\":1,\"title\":\"Supplier Address\",\"value\":\"12 rue Albert Einstein\\n77420 Champs sur Marne - France\",\"content\":\"12 rue Albert Einstein\\n77420 Champs sur Marne - France\"},{\"score\":0.8681732580037664,\"value_type\":\"text\",\"checks\":{},\"bbox\":[828,30,986,60],\"name\":\"sender_addrline\",\"page\":1,\"title\":\"Supplier Address Line\",\"value\":\"12 rue Albert Einstein\",\"content\":\"12 rue Albert Einstein\"},{\"score\":0.90625,\"value_type\":\"text\",\"checks\":{},\"bbox\":[828,54,1086,78],\"name\":\"sender_addrline\",\"page\":1,\"title\":\"Supplier Address Line\",\"value\":\"77420 Champs sur Marne - France\",\"content\":\"77420 Champs sur Marne - France\"},{\"score\":0.46112604525832834,\"value_type\":\"text\",\"checks\":{},\"bbox\":[363,1710,449,1728],\"name\":\"sender_ic\",\"page\":1,\"title\":\"Supplier Company ID\",\"value\":\"480879733\",\"content\":\"480 879 733\"},{\"score\":0.9283394971218274,\"value_type\":\"text\",\"checks\":{},\"bbox\":[617,1704,735,1728],\"name\":\"sender_vat_id\",\"page\":1,\"title\":\"Supplier VAT Number\",\"value\":\"FR18480879733\",\"content\":\"FR18480879733\"},{\"score\":0.24980244643036878,\"bbox\":[466,378,514,402],\"name\":\"tax_details\",\"page\":0,\"title\":\"Tax Details\",\"content\":[{\"score\":0.5417607223476311,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1025,522,1125,552],\"name\":\"tax_detail_base\",\"page\":0,\"title\":\"Tax Base\",\"value\":\"27574.00\",\"content\":\"27,574.00\"},{\"score\":0.24980244643036878,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[466,378,514,402],\"name\":\"tax_detail_rate\",\"page\":0,\"title\":\"Tax Rate\",\"value\":\"20.00\",\"content\":\"20.00\"},{\"score\":0.6544662636648347,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1040,546,1128,582],\"name\":\"tax_detail_tax\",\"page\":0,\"title\":\"Tax Amount\",\"value\":\"5514.80\",\"content\":\"5,514.80\"},{\"score\":0.7257310606756009,\"value_type\":\"number\",\"checks\":{\"amount_equations\":\"good\"},\"bbox\":[1026,576,1128,612],\"name\":\"tax_detail_total\",\"page\":0,\"title\":\"Tax Total\",\"value\":\"33088.80\",\"content\":\"33,088.80\"}]},{\"score\":0.7258706500170781,\"value_type\":\"text\",\"checks\":{},\"bbox\":[304,216,418,246],\"name\":\"terms\",\"page\":1,\"title\":\"Terms\",\"value\":\"15 net days\",\"content\":\"15 net days\"}],\"message\":\"Document processing finished.\",\"status\":\"ready\"}");
      JSONArray fieldsArray = result.getJSONArray("fields");
      Map<String, Integer> fieldsArrayKeyMap = new HashMap<>();
      Integer keyOccurance = 0;
      for (Integer i = 0; i < fieldsArray.length(); i++) {
        String name = fieldsArray.getJSONObject(i).getString("name");
        if (fieldsArrayKeyMap != null && name != null && fieldsArrayKeyMap.containsKey(name)) {
          Integer newKeyOccurance = (Integer) fieldsArrayKeyMap.get(name) + 1;
          fieldsArray.getJSONObject(i).put("name", name + "_" + newKeyOccurance);
          fieldsArrayKeyMap.put(name, newKeyOccurance);
        } else {
          fieldsArrayKeyMap.put(name, keyOccurance);
        }
      }
      System.err.println(fieldsArray);
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }
}