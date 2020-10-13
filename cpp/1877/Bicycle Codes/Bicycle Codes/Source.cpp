#include <iostream>

using namespace std;

int main() {

	int a;
	cin >> a;
	if (a % 2 == 0) {
		cout << "yes";
	} else {
		cin >> a;
		if (a % 2 == 1) {
			cout << "yes";
		}else {
			cout << "no";
		}
	}
	
	return 0;
}