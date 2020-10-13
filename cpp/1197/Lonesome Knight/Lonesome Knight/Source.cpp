#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;
	string k;
	cin >> n;
	int sir[100];
	for (int i=0; i<n; i++) {
		cin >> k;
		auto rez = 0;
		if (k[0] == 'a' || k[0] == 'h') {
			if (k[1] == '1' || k[1]=='8') {
				rez = 2;
			} else if (k[1] == '2' || k[1] == '7') {
				rez = 3;
			}
			else rez = 4;
		} else if (k[0] == 'b' || k[0] == 'g') {
			if (k[1] == '1' || k[1] == '8') {
				rez = 3;
			} else if (k[1] == '2' || k[1] == '7') {
				rez = 4;
			}
			else rez = 6;
		} else if (k[1] == '1' || k[1] == '8') {
			rez = 4;
		} else if (k[1] == '2' || k[1] == '7') {
			rez = 6;
		}
		else rez = 8;
		sir[i] = rez;
	}
	for (int i=0; i<n; i++) {
		cout << sir[i] << endl;
	}

	return 0;
}