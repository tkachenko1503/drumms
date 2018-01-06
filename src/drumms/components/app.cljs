(ns drumms.components.app
  (:require [forest.macros :refer-macros [defstylesheet]]
            [drumms.components.drumm-kit :refer [drumm-kit]]
            [drumms.components.snare :refer [snare]]
            [drumms.components.kick :refer [kick]]
            [drumms.components.hi-hat :refer [hi-hat]]
            [drumms.components.crash :refer [crash]]
            [drumms.components.small-tom :refer [small-tom]]
            [drumms.components.rack-tom :refer [rack-tom]]
            [drumms.components.floor-tom :refer [floor-tom]]))


(defstylesheet styles
               [.app-container {:background-color "#80CBC4"
                                :height "100vh"
                                :display "flex"
                                :flex-direction "column"
                                :justify-content "center"
                                :align-items "center"}]

               [.content {:width "80%"
                          :background-color "#455A64"
                          :box-shadow "0px 4px 9px 4px rgba(0,0,0,0.16)"}])

(defn app
  "Main app component"
  []
  [:div {:class app-container}
   [:div {:class content}
    [drumm-kit

     [crash {:x 1.35
             :y 1.4}]

     [small-tom {:x 3.75
                 :y 1.4}]

     [rack-tom {:x 5.95
                :y 1.4}]

     [floor-tom {:x 8.5
                 :y 1.4}]

     [kick {:x 8.2
            :y 4.35}]

     [hi-hat {:x 1.4
              :y 4.35}]

     [snare {:x 4.5
             :y 4.35}]]]])
