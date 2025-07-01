# Python Sample for Something Theme
from typing import List

class Greeter:
    """A sample class to demonstrate Python syntax."""

    # A class attribute
    PI = 3.14159

    def __init__(self, name: str):
        self.name = name

    def greet(self, loud: bool = False):
        """Greets the person."""
        greeting = f"Hello, {self.name}!"
        if loud:
            print(greeting.upper())
        else:
            print(greeting)

if __name__ == "__main__":
    greeter = Greeter("Something")
    greeter.greet()
    greeter.greet(loud=True)