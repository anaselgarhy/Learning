pub mod pizza_older {
    pub struct Pizza {
        pub dough: String,
        pub cheese: String,
        pub topping: String,
    }

    impl Pizza {
        pub fn lunch(topping: &str) -> Pizza {
            Pizza {
                dough: String::from("regular dough"),
                cheese: String::from("mozzarella"),
                topping: String::from(topping),
            }
        }
    }

    pub mod help_customer {
        fn set_on_table() {
            println!("Customer set on table");
        }

        pub fn take_order(topping: &str) {
            println!("Customer took order.");
            set_on_table();
            
            let custmer_pizza = super::Pizza::lunch(topping);
            serve_customer(custmer_pizza);
        }

        fn serve_customer(pizza: super::Pizza) {
            println!("The customer got a {} pizza with {} and {}", pizza.dough, pizza.cheese, pizza.topping);
        }
    }
}
