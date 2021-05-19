package VendingMachine;

import VendingMachine.Money.Money;

import java.io.IOException;
import java.util.ArrayList;

public interface State {

     void FillMachineMoney() throws IOException;

     void FillMachineItems() throws IOException;

     int Ready();

     double getMoneyValue(ArrayList<Money> list);

     boolean validateCash(int choice, int category);

     void AcceptCashAndChange(ArrayList<Money> Money) throws IOException;

     void AcceptCard() throws IOException;

     void ReFillItem(ArrayList<item> items, item item) throws IOException;

}
