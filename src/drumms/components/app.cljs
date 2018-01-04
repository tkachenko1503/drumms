(ns drumms.components.app
  (:require [forest.macros :refer-macros [defstylesheet]]))

(defstylesheet app-styles
  [.hello {:color "green"}])

(defn app
  "Main app component"
  []
  [:div {:class hello}
   "Hello Drumms!"])
