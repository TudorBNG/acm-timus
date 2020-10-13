#include <iostream>
#include <string>

using namespace std;

int main() {
	int n, k = 1, col = 0;
	string s;
	cin >> n;
	
	for (int i=0; i<n; i++) {
		cin >> s;
		if (s[0]=='A' || s[0] == 'P' || s[0] == 'O' || s[0] == 'R') {
			col += abs(k - 1);
			k = 1;
		}else if (s[0] == 'B' || s[0] == 'M' || s[0] == 'S') {
			col += abs(k - 2);
			k = 2;
		}else {
			col += abs(k - 3);
			k = 3;
		}
	}
	cout << col;

	return 0;
}