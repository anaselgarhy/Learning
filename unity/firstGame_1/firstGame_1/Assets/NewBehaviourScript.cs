using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    int frameCount = 0;
    // Start is called before the first frame update
    void Start()
    {
        print("Start");

        float dst = GetTheDistenceBetwenTowPoints(0, 5, 10, 15);
        print(dst);
        
    }

    // Update is called once per frame
    void Update()
    {
        frameCount++;
        //print("Fream count: " + frameCount);
       
    }

    float GetTheDistenceBetwenTowPoints(float x1, float y1, float x2, float y2)
    {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float dstSq = dx * dx + dy * dy;
        float dst = Mathf.Sqrt(dstSq);

        return dst;
    }
}
