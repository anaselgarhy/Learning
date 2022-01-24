using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Game : MonoBehaviour
{
    int randomTime;
    // Start is called before the first frame update
    void Start()
    {
        SetRandomTime();
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown())
    }

    void SetRandomTime()
    {
        randomTime = Random.Range(5, 21); // 5 - 20
        print(randomTime + " Seconds");
    }
}
