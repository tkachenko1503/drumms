(ns drumms.audio)

(def audio-map
  {:snare     (js/Audio. "/sounds/snare.mp3")
   :kick      (js/Audio. "/sounds/kick.mp3")
   :hi-hat    (js/Audio. "/sounds/hi-hat.mp3")
   :crash     (js/Audio. "/sounds/crash.mp3")
   :small-tom (js/Audio. "/sounds/small-tom.mp3")
   :rack-tom  (js/Audio. "/sounds/rack-tom.mp3")
   :floor-tom (js/Audio. "/sounds/floor-tom.mp3")})
