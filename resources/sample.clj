;; Clojure Sample for Something Theme

(ns something.sample
  "A sample namespace to demonstrate Clojure syntax highlighting."
  (:require [clojure.string :as str]))



(defonce ^:private app-state (atom {:count 0}))

(defn- my-private-function [arg]
  (str "Hello, " arg "!"))

(defmacro unless [pred a b]
  `(if (not ~pred) ~a ~b))

(defn public-function
  "This is a public function with a docstring."
  [name]
  (let [greeting (my-private-function name)
        counter (swap! app-state update :count inc)]
    (println greeting)
    (println (str/join " " ["Counter:" (:count counter)]))
    (unless (= name "World")
      (println "You are not the world.")
      nil)))

(public-function "Something")