#include <iostream>

using namespace std;

int main() {
	int n, k, a;

	cin >> k;
	cin >> n;
	int lobby = 0;

	while (cin >> a) {
		a = a + lobby;
		a = k - a;
		if (a>=0) {
			lobby = 0;
		} else {
			lobby = abs(a);
		}
	}

	if (lobby == 0) {
		cout << 0;
	}else {
		cout << lobby;
	}
	
	return 0;
}