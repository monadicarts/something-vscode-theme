// Go Sample for Something Theme
package main

import (
	"fmt"
	"time"
)

const Greeting string = "Hello, Go!"

type SampleStruct struct {
	ID   int
	Name string
}

func (s *SampleStruct) Greet() {
	fmt.Printf("ID: %d, Name: %s says %s\n", s.ID, s.Name, Greeting)
}

func main() {
	sample := &SampleStruct{ID: 1, Name: "Something"}
	go sample.Greet() // Concurrency

	// Wait for the goroutine to finish
	time.Sleep(100 * time.Millisecond)
	fmt.Println("Program finished.")
}
