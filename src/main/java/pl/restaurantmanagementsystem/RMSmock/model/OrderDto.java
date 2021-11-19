package pl.restaurantmanagementsystem.RMSmock.model;

import lombok.ToString;
import pl.restaurantmanagementsystem.RMSmock.modelIn.FoodIn;

import java.util.List;

@ToString
public class OrderDto {
    public List<FoodIn> foodInList;

}
