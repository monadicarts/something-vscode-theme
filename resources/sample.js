// JavaScript Sample for Something Theme

/**
 * A sample class to demonstrate syntax.
 * @property {string} name - The name of the person.
 */
class Person {
  constructor(name) {
    this.name = name;
  }

  greet() {
    // Using a template literal
    console.log(`Hello, my name is ${this.name}.`);
  }
}

const person = new Person('Something');
person.greet();

const somePromise = new Promise((resolve) => setTimeout(() => resolve(42), 1000));

async function getValue() {
  const value = await somePromise;
  console.log(`The answer is ${value}.`);
}

getValue();