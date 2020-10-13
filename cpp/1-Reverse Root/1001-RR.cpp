#include <iostream>
#include <iomanip>

using namespace std;

int main() {
	char a;
	long long b[1000];
	int k = 0;
	//ifstream f("in.txt");
	//ofstream g("out.txt");
	while (cin.get(a)) {
		if (a=='\n') {
			continue;
		} else if(a!=' ') {
			b[k] = atoll(&a);
			while (cin.get(a) && (a!=' ') && (a!='\n')) {
				b[k] = b[k] * 10 + atoll(&a);
			}
			k++;
		}
	}
	for (int i = 0; i < k; i++)	{
		cout << setprecision(4) << fixed << sqrt(b[k - i - 1]) << endl;
	}
	//f.close();
	//g.close();
	//uint64_t a;
	//cin >> a;

	return 0;
}