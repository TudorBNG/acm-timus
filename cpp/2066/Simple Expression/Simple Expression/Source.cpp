#include <iostream>

using namespace std;

int main() {
	int a, b, c, aux;
	cin >> a;
	cin >> b;
	cin >> c;

	if (a>b) {
		aux = b;
		b = a;
		a = aux;
	}

	if (b>c) {
		aux = c;
		c = b;
		b = aux;
	}

	if (a>b) {
		aux = a;
		a = c;
		c = aux;
	}

	if (b==0 || b==1) {
		cout << a - b - c;
	}else {
		cout << a - b * c;
	}
	return 0;
}