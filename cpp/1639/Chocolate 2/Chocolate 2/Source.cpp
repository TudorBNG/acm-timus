#include <iostream>

using namespace std;

int main() {
	short m, n;
	cin >> m >> n;
	if (m*n%2 == 0) {
		cout << "[:=[first]";
	} else {
		cout << "[second]=:]";
	}
	return 0;
}