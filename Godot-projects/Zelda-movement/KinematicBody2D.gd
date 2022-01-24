extends KinematicBody2D

export var speed := 700.0

func _physics_process(_delta: float) -> void:
	var input_vertor := Victor2(
		Input.get_action_strength("ui_right") - Input.get_action_strength("ui_left"),
		Input.get_action_strength("ui_down") - Input.get_action_strength("ui_up")
	)

	var move_direction := input_vertor.normalize() # Normalize the input vector
	move_and_slide(move_direction * speed)
