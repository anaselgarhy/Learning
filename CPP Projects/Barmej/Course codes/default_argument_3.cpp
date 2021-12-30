#include <iostream>
void signUp(std::string email, std::string name="none", std::string phone="");
int main(void)
{
	signUp("exampile@email.com", "Anas", "055 545 654");
	signUp("emaa@nomial.bo", "Emmaa");
	signUp("pop@outlook.com");
	return 0;
}
void signUp(std::string email, std::string name, std::string phone)
{
	std::cout << "Email=" + email + "," << "Name=" + name + "," << "Phone=" + phone + "\n";
}
