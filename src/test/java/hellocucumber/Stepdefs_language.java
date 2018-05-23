package hellocucumber;

import cucumber.api.java.no.Gitt;
import cucumber.api.java.no.Når;
import cucumber.api.java.no.Så;

public class Stepdefs_language {
    @Når("^Ordmaker starter et spill$")
    public void ordmaker_starter_et_spill() throws Exception {
    }

    @Så("^må Ordmaker vente på at Gjetter blir med$")
    public void må_Ordmaker_vente_på_at_Gjetter_blir_med() throws Exception {
    }

    @Gitt("^at Ordmaker har startet et spill med ordet \"([^\"]*)\"$")
    public void at_Ordmaker_har_startet_et_spill_med_ordet(String arg1) throws Exception {
    }

    @Når("^Gjetter blir med på Ordmakers spill$")
    public void gjetter_blir_med_på_Ordmakers_spill() throws Exception {
    }

    @Så("^må Gjetter gjette et ord på (\\d+) bokstaver$")
    public void må_Gjetter_gjette_et_ord_på_bokstaver(int arg1) throws Exception {
    }
}
