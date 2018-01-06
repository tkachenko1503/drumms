(ns drumms.components.text
  (:require [forest.macros :refer-macros [defstylesheet]]))

(defstylesheet styles
               [.text-content {:-webkit-user-select "none"
                               :-moz-user-select    "none"
                               :user-select "none"}])

(defn text
  "Wrapped text tag"
  [params text]
  [:text (merge
           {:fill        "#000"
            :stroke      "none"
            :font-size   "0.3px"
            :text-anchor "middle"
            :class text-content}
           params)
   text])
