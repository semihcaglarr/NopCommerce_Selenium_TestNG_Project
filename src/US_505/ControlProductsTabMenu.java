package US_505;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ControlProductsTabMenu extends BaseDriver {


    @Test
    @Parameters("mesaj")
    public void ControlProductsTabMenuTest(String gelenMesaj) {
        ControlProductsTabMenu_Elements cptme = new ControlProductsTabMenu_Elements();

        for (int i = 0; i < cptme.tabMenuList.size(); i++) {
            switch (cptme.tabMenuList.get(i).getText().trim()) {
                case "Computers":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    for (int j = 0; j < cptme.computersList.size(); j++) {
                        Tools.ActionHover(cptme.computersTab);
                        System.out.println(cptme.computersList.get(j).getText());
                    }
                    break;
                case "Electronics":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    for (int k = 0; k < cptme.electronicsList.size(); k++) {
                        Tools.ActionHover(cptme.electonicsTab);
                        System.out.println(cptme.electronicsList.get(k).getText());
                    }
                    break;
                case "Apparel":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    for (int l = 0; l < cptme.apparelList.size(); l++) {
                        Tools.ActionHover(cptme.apparelTab);
                        System.out.println(cptme.apparelList.get(l).getText());
                    }
                    break;
                case "Digital downloads":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    break;
                case "Books":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    break;
                case "Jewelry":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    break;
                case "Gift Cards":
                    System.out.println(cptme.tabMenuList.get(i).getText());
                    break;
                default:
                    System.out.println("Wrong Access");
            }
        }

        Tools.ActionHover(cptme.computersTab);
        cptme.noteBooksTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.noteBookNameList));
        cptme.viewMode.click();

        for (int i = 0; i < cptme.noteBookNameList.size(); i++) {
            System.out.println(cptme.noteBookNameList.get(i).getText());
        }
        int random = Tools.randomGenerator(cptme.noteBookNameList.size());
        Tools.JavaScriptClick(cptme.noteBookNameList.get(random));


        Tools.wait(3);
        Tools.ActionScroll(cptme.searchInput);
//        Tools.JavaScriptClick(cptme.searchInput);
//        Tools.JavaScriptScroll(cptme.searchInput);
        cptme.searchInput.sendKeys(gelenMesaj);
        cptme.searchButton.click();

        for (WebElement e : cptme.noteBookNameList) {
            if (e.getText().equalsIgnoreCase(gelenMesaj)) {
                System.out.println("Ürün Bulundu");
            } else {
                System.out.println("Ürün Bulunamadı");
            }
        }


    }
}


//        for (int i = 0; i < cptme.tabMenuList.size(); i++) {
//            if (cptme.tabMenuList.get(i).getText().trim().equals("Computers")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//                for (int j = 0; j < cptme.computersList.size(); j++) {
//                    Tools.ActionHover(cptme.computersTab);
//                    System.out.println(cptme.computersList.get(j).getText());
//                }
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Electronics")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//                for (int k = 0; k < cptme.electronicsList.size(); k++) {
//                    Tools.ActionHover(cptme.electonicsTab);
//                    System.out.println(cptme.electronicsList.get(k).getText());
//                }
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Apparel")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//                for (int l = 0; l < cptme.apparelList.size(); l++) {
//                    Tools.ActionHover(cptme.apparelTab);
//                    System.out.println(cptme.apparelList.get(l).getText());
//                }
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Digital downloads")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Books")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Jewelry")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//            } else if (cptme.tabMenuList.get(i).getText().trim().equals("Gift Cards")) {
//                System.out.println(cptme.tabMenuList.get(i).getText());
//            }
//
//        }


