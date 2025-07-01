// C++ Sample for Something Theme
#include <iostream>
#include <vector>
#include <string>

#define VERSION "1.0.0"

namespace Something {

template<typename T>
class Sample {
private:
    T _data;

public:
    Sample(T data) : _data(data) {}

    void print() {
        std::cout << "Data: " << _data << std::endl;
    }
};

} // namespace Something

int main() {
    Something::Sample<std::string> s("Hello C++");
    s.print();
    std::cout << "Version: " << VERSION << std::endl;
    return 0;
}